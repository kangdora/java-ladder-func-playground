package view;

import dto.LadderDTO;

import java.util.List;

public class ResultView {
    public static void displayLadder(LadderDTO ladderDTO) {
        System.out.println("실행결과\n");
        for (List<Boolean> line : ladderDTO.ladders()) {
            printLadder(line);
        }
    }

    private static void printLadder(List<Boolean> line) {
        System.out.print("    |");
        for (Boolean step : line) {
            printStep(step);
            System.out.print("|");
        }
        System.out.println();
    }

    private static void printStep(Boolean step) {
        if (step) {
            System.out.print("-----");
            return;
        }
        System.out.print("     ");
    }

    public static void displayResults(LadderDTO ladderDTO) {
        System.out.println("사다리 결과:");
        ladderDTO.results().forEach((start, end) ->
                System.out.println(start + " -> " + end)
        );
    }
}

