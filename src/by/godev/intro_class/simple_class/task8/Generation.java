package by.godev.intro_class.simple_class.task8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generation {
	private static final char[] letter_u;
	private static final char[] letter_l;

	static {
		letter_u = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		letter_l = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	}

	public static String createID_UL(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int v = createIntDigit(3);
			switch (v) {
			case 0: sb.append(createIntDigit(10));
			case 1: sb.append(createCharUp());
			case 2: sb.append(createCharLow());
			}
		}
		return sb.toString();
	}
	
	public static String createID_U(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int v = createIntDigit(2);
			switch (v) {
			case 0: sb.append(createIntDigit(10));
			case 1: sb.append(createCharUp());
			}
		}
		return sb.toString();
	}

	public static String createID_L(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int v = createIntDigit(2);
			switch (v) {
			case 0: sb.append(createIntDigit(10));
			case 1: sb.append(createCharLow());
			}
		}
		return sb.toString();
	}
	
	public static long createLongNumber(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			sb.append(createIntDigit(10));
		}
		
		return Long.parseLong(sb.toString());
	}

	public static String createIntNumber(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			sb.append(createIntDigit(10));
		}
		return sb.toString();
	}

	private static char createCharUp() {
		int g = createIntDigit(letter_u.length);
		return letter_u[g];
	}

	private static char createCharLow() {
		int g = createIntDigit(letter_l.length);
		return letter_l[g];
	}

	private static int createIntDigit(int len) {
		Random rand = new Random();
		rand.setSeed(newRandSeed());
		return rand.nextInt(len);
	}

	private static long newRandSeed() {
		return ThreadLocalRandom.current().nextLong();
	}
}
