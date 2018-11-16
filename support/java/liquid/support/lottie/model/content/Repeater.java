package liquid.support.lottie.model.content;

import android.support.annotation.Nullable;

import liquid.support.lottie.LottieDrawable;
import liquid.support.lottie.animation.content.Content;
import liquid.support.lottie.animation.content.RepeaterContent;
import liquid.support.lottie.model.animatable.AnimatableFloatValue;
import liquid.support.lottie.model.animatable.AnimatableTransform;
import liquid.support.lottie.model.layer.BaseLayer;

public class Repeater implements ContentModel {
  private final String name;
  private final AnimatableFloatValue copies;
  private final AnimatableFloatValue offset;
  private final AnimatableTransform transform;

  public Repeater(String name, AnimatableFloatValue copies, AnimatableFloatValue offset,
      AnimatableTransform transform) {
    this.name = name;
    this.copies = copies;
    this.offset = offset;
    this.transform = transform;
  }

  public String getName() {
    return name;
  }

  public AnimatableFloatValue getCopies() {
    return copies;
  }

  public AnimatableFloatValue getOffset() {
    return offset;
  }

  public AnimatableTransform getTransform() {
    return transform;
  }

  @Nullable @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new RepeaterContent(drawable, layer, this);
  }
}
