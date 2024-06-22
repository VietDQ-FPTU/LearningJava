/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_changebase;

/**
 *
 * @author Thinkpad
 */
class ChangeBase {

    static String changeBase(int input, int output, String value) {
        if (input == 1) {
            if (output == 1) {
                return value;
            } else if (output == 2) {
                return binaryToDecimal(value);
            } else if (output == 3) {
                return decimalToHexadecimal(binaryToDecimal(value));
            }
        } else if (input == 2) {
            if (output == 1) {
                return decimalToBinary(value);
            } else if (output == 2) {
                return value;
            } else if (output == 3) {
                return decimalToHexadecimal(value);
            }
        } else if (input == 3) {
            if (output == 1) {
                return decimalToBinary(hexadecimalToDecimal(value));
            } else if (output == 2) {
                return hexadecimalToDecimal(value);
            } else if (output == 3) {
                return value;
            }
        }
        return null;
    }

    private static String binaryToDecimal(String value) {
        long valueDecimal = Long.parseLong(value), index = 0, result = 0;
        while (valueDecimal != 0) {
            result += (valueDecimal % 10) * Math.pow(2, index);
            valueDecimal = valueDecimal / 10;
            index++;
        }
        System.out.println(result);
        return String.valueOf(result);
    }

    private static String decimalToHexadecimal(String value) {
        long valueL = Long.parseLong(value);
        String valueS = "";
        while (valueL != 0) {
            if (valueL % 16 >= 0 && valueL % 16 <= 9) {
                valueS = String.valueOf(valueL % 16) + valueS;
            } else if (valueL % 16 == 10) {
                valueS = 'A' + valueS;
            } else if (valueL % 16 == 11) {
                valueS = 'B' + valueS;
            } else if (valueL % 16 == 12) {
                valueS = 'C' + valueS;
            } else if (valueL % 16 == 13) {
                valueS = 'D' + valueS;
            } else if (valueL % 16 == 14) {
                valueS = 'E' + valueS;
            } else if (valueL % 16 == 15) {
                valueS = 'F' + valueS;
            }
            valueL = valueL / 16;
        }
        return valueS;
    }

    private static String decimalToBinary(String value) {
        String array[] = value.split("\\.");
        long valueL =  Long.valueOf(array[0]);
        String result = "";
        while (valueL != 0) {
            result = String.valueOf(valueL % 2) + result;
            valueL /= 2;
        }
        if (array.length > 1) {
            result += ".";
            int index2 = 0;
            double x = Double.valueOf("0." + array[1]);
            while (x != 0 && index2 < 10) {
                x *= 2;
                if (x < 1) {
                    result += "0";
                } else {
                    result += "1";
                    x -= 1;
                }
                index2++;
            }
        }
        return result;
    }

    private static String hexadecimalToDecimal(String value) {
        double valueL = 0;
        int index = 0, index2 = -1;
        String[] array = value.split("\\.");
        for (int i = array[0].length() - 1; i >= 0; i--) {
            if (value.charAt(i) >= '0' && value.charAt(i) <= '9') {
                valueL += (long) (Character.getNumericValue(value.charAt(i)) * Math.pow(16, index));
            } else if (value.charAt(i) == 'A') {
                valueL += (long) (10 * Math.pow(16, index));
            } else if (value.charAt(i) == 'B') {
                valueL += (long) (11 * Math.pow(16, index));
            } else if (value.charAt(i) == 'C') {
                valueL += (long) (12 * Math.pow(16, index));
            } else if (value.charAt(i) == 'D') {
                valueL += (long) (13 * Math.pow(16, index));
            } else if (value.charAt(i) == 'E') {
                valueL += (long) (14 * Math.pow(16, index));
            } else if (value.charAt(i) == 'F') {
                valueL += (long) (15 * Math.pow(16, index));
            } else if (value.charAt(i) == '.') {
                break;
            }
            index++;
        }
        if (array.length > 1) {
            for (int i = 0; i < array[1].length(); i++) {
                if (array[1].charAt(i) >= '0' && value.charAt(i) <= '9') {
                    valueL += (Character.getNumericValue(array[1].charAt(i)) * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'A') {
                    valueL += (10 * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'B') {
                    valueL += (11 * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'C') {
                    valueL += (12 * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'D') {
                    valueL += (13 * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'E') {
                    valueL += (14 * Math.pow(16, index2));
                } else if (array[1].charAt(i) == 'F') {
                    valueL += (15 * Math.pow(16, index2));
                }
                index2--;
            }
        }
        return String.valueOf(valueL);
    }
}
