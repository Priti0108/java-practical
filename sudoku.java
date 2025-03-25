import java.util.*;

class Game {
    private int size;
    private int[][] board;
    private int[][] puzzle;

    // Constructor to initialize the game
    public Game(int size) {
        this.size = size;
        this.board = new int[size][size];
        this.puzzle = new int[size][size];
    }

    // Generate a fully solved Sudoku grid
    public void generateSolvedBoard() {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) numbers[i] = i + 1;
        for (int row = 0; row < size; row++) {
            List<Integer> remainingNumbers = new ArrayList<>();
            for (int num : numbers) remainingNumbers.add(num);
            Collections.shuffle(remainingNumbers);
            for (int col = 0; col < size; col++) {
                board[row][col] = remainingNumbers.get(col);
            }
        }
    }

    // Remove numbers to create a puzzle based on difficulty
    public void createPuzzle(int level) {
        int removeCount = 0;
        switch (level) {
            case 1: removeCount = size * size / 3; break; // Easy
            case 2: removeCount = size * size / 2; break; // Medium
            case 3: removeCount = size * size * 3 / 4; break; // Hard
            default: removeCount = size * size / 2; break; // Default: Medium
        }

        // Deep copy board to puzzle
        for (int i = 0; i < size; i++) {
            System.arraycopy(board[i], 0, puzzle[i], 0, size);
        }

        Random rand = new Random();
        while (removeCount > 0) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            if (puzzle[row][col] != 0) {
                puzzle[row][col] = 0;
                removeCount--;
            }
        }
    }

    // Print the grid with borders and layout pattern
    public void printBoard() {
        int ln = 2 * size + 1;
        int p = 2 * size + 1;

        // Print the grid with formatting
        for (int row = 0; row < ln; row++) {
            for (int col = 0; col < p; col++) {
                if (row % 2 == 0) {
                    if (col % 2 == 0) {
                        System.out.print(" ");  // Empty cell
                    } else {
                        System.out.print("---");  // Horizontal border
                    }
                } else {
                    if (col % 2 == 0) {
                        System.out.print("|");  // Vertical border
                    } else {
                        if (puzzle[row / 2][col / 2] == 0) {
                            System.out.print("   ");  // Empty space inside grid
                        } else {
                            System.out.print(" " + puzzle[row / 2][col / 2] + " ");  // Print the grid values
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    // Check if the solution is valid
    public boolean checkSolution() {
        for (int row = 0; row < size; row++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for (int col = 0; col < size; col++) {
                if (rowSet.contains(board[row][col]) || colSet.contains(board[col][row])) {
                    return false;
                }
                rowSet.add(board[row][col]);
                colSet.add(board[col][row]);
            }
        }
        return true;
    }

    // Start the game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        // Ask for the grid size
        System.out.println("Enter the size of the grid : ");
        size = scanner.nextInt();

        // Generate and create puzzle
        generateSolvedBoard();
        System.out.println("Enter difficulty (1 = Easy, 2 = Medium, 3 = Hard): ");
        int level = scanner.nextInt();
        createPuzzle(level);

        // Game loop
        boolean solved = false;
        while (!solved) {
            printBoard();

            System.out.println("Enter row (1-" + size + "), column (1-" + size + "), and number (1-" + size + ") to fill : ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            int num = scanner.nextInt();

            if (row >= 0 && row < size && col >= 0 && col < size && num >= 1 && num <= size) {
                puzzle[row][col] = num;
                solved = checkSolution();
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }

        System.out.println("Congratulations! You've solved the puzzle.");
    }

    public static void main(String[] args) {
        Game game = new Game(5); // Default size is 5
        game.playGame();
    }
}

