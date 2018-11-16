package liquid.support.lottie.model.animatable;

import android.graphics.Path;

import liquid.support.lottie.value.Keyframe;
import liquid.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import liquid.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import liquid.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
