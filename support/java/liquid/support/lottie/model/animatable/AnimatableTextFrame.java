package liquid.support.lottie.model.animatable;

import liquid.support.lottie.value.Keyframe;
import liquid.support.lottie.animation.keyframe.TextKeyframeAnimation;
import liquid.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
