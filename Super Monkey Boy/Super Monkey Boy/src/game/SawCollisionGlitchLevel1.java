package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Collision listener for saws in level 3.
 */
public class SawCollisionGlitchLevel1 implements CollisionListener {
    private Monkey monkey;
    private Game game;
    
    // Makes monkey from current 'this' session equal to monkey within this class
    public SawCollisionGlitchLevel1(Monkey monkey, Game game) {
        this.monkey = monkey;
        this.game = game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == monkey) {
            game.increaseDeathCount();
            monkey.setPosition(new Vec2(1, 11));
        }
    }
}
