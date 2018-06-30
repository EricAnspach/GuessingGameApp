package webapp;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine();					
		return s;
	}
	
	public static String getString(String prompt, String s1, String s2) {
		String s = "";
		System.out.print(prompt);
		
		boolean isValid = false;
		while (!isValid) {
			s = sc.next();
			if(s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)) {
				isValid = true;
			} else {
				System.out.println("Error! This entry is required. Try again.");
			}
			sc.nextLine();			
		}
		return s;
	}
	
	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				
				if (i < 0 || i > 100) {
					System.out.println("Error! Invalid integer. Try again.");
				} else {
					isValid = true;					
				}

			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}		
			
			sc.nextLine();
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
	
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = Console.getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    
    // validate entries in front end
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println("Error! Number must be greater than " + min);
            } else if (i >= max) {
                System.out.println("Error! Number must be less than " + max);
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    public static String getChoiceString(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

	
	public static void displayLine() {
		System.out.println();
	}
	
	public static void displayLine(String line) {
		System.out.println(line);
	}
}

