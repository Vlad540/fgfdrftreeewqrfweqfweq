package defpackage;

import android.animation.ValueAnimator;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

/* renamed from: ru7  reason: default package */
public final /* synthetic */ class ru7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MarkdownMenuView b;

    public /* synthetic */ ru7(MarkdownMenuView markdownMenuView, int i) {
        this.a = i;
        this.b = markdownMenuView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MarkdownMenuView markdownMenuView = this.b;
        switch (this.a) {
            case 0:
                int i = MarkdownMenuView.y0;
                markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                int i2 = MarkdownMenuView.y0;
                markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                int i3 = MarkdownMenuView.y0;
                markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                int i4 = MarkdownMenuView.y0;
                markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                markdownMenuView.postInvalidate();
                return;
        }
    }
}
