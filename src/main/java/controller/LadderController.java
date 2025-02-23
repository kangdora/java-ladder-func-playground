package controller;

import dto.LadderDTO;
import service.LadderService;
import view.InputView;
import view.ResultView;

public class LadderController {
    private final LadderService ladderService;

    public LadderController() {
        this.ladderService = new LadderService();
    }

    public void startGame() {
        int height = InputView.getHeight();
        int width = InputView.getWidth();
        LadderDTO ladderDTO = ladderService.createLadderGame(height, width);
        ResultView.displayLadder(ladderDTO);
        ResultView.displayResults(ladderDTO);
    }
}
