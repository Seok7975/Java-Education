class ThreeSixNineGame {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자에 대해 369 게임 실행
        for (int i = 1; i <= 100; i++) {
            if (isClapRequired(i)) {
                int clapCount = countClaps(i);
                for (int j = 0; j < clapCount; j++) {
                    System.out.print("짝!");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }

    // 3, 6, 9가 들어간 숫자인지 확인하는 메소드
    private static boolean isClapRequired(int number) {
        String strNumber = Integer.toString(number);

        for (char digit : strNumber.toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                return true; // 3, 6, 9가 포함된 경우
            }
        }

        return false; // 3, 6, 9가 포함되지 않은 경우
    }

    // 3, 6, 9의 갯수를 세는 메소드
    private static int countClaps(int number) {
        String strNumber = Integer.toString(number);
        int clapCount = 0;

        for (char digit : strNumber.toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }
}