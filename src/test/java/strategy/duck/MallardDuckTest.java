package strategy.duck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import strategy.duck.duckbehavior.FlyBehavior;
import strategy.duck.duckbehavior.FlyRocketPowered;
import strategy.duck.duckbehavior.QuackBehavior;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class MallardDuckTest {

    @Mock
    FlyBehavior flyBehavior;

    @Mock
    QuackBehavior quackBehavior;

    @InjectMocks
    MallardDuck mallardDuck;

    @Test
    @DisplayName("performFly Method called One time")
    void performFlyMethodCalledOneTime() {
        mallardDuck.performFly();
        verify(flyBehavior, times(1)).fly();
    }

    @Test
    @DisplayName("quack method called one time")
    void quackMethodCalledOneTime() {
        mallardDuck.performQuack();
        verify(quackBehavior, times(1)).quack();
    }

    @Test
    @DisplayName("failure")
    void failure() {
        fail("Not Implemented x");
    }
}