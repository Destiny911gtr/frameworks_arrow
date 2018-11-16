package liquid.support.lottie.model.content;


import android.support.annotation.Nullable;

import liquid.support.lottie.LottieDrawable;
import liquid.support.lottie.animation.content.Content;
import liquid.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
