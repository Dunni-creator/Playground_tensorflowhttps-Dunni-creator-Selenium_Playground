package Tests;

import Base.Base;
import Pages.PlayGround;
import org.testng.annotations.Test;

public class PlayGroundTest extends Base {


    @Test
    public void playgroundTensorflow() throws InterruptedException {

        homePage.printTestLoss();
        PlayGround playground = homePage.playGround();
        //Print loss value is console based on step- ii
        playground.PrintLossValue();

        //Change dataset based on step- iii
        playground.ExclusiveOR();

        //Change Noise based on step- iv
        playground.SelectNoise();

        //Select two features based on step- v
        playground.FeatureSelect();

        //Remove one reuron from the both section based on the step- vi
        playground.MinimizedNeurones();

        //Change Learning rate based on the step- vii
        playground.selectLearningRate();

        //Click on Simulation based on the step- viii and waite until more than 0.3(000 300) based on step- ix
        playground.ClickSimulationButton();

        //Print number of execution epoch
        playground.PrintEpocValue();

        //Print loss value based on the step- x
        playground.PrintLossValue();
    }
}
