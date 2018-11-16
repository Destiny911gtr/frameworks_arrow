package liquid.support.lottie.model.animatable;

import liquid.support.lottie.value.Keyframe;
import liquid.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import liquid.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import liquid.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
