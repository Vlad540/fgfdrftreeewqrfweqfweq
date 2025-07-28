package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import ru.ok.messages.media.mediabar.SimpleTransitionDraweeView;

public class VideoThumbnailView extends SimpleTransitionDraweeView {
    public n10 B0;
    public final qcc C0 = new qcc();
    public int D0;
    public int E0;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.views.widgets.VideoThumbnailView, on4, android.view.View] */
    private void setPlaceHolderDrawable(Drawable drawable) {
        z66 z66 = new z66(getResources());
        jlc jlc = jlc.g;
        z66.l = jlc;
        z66.d = drawable;
        z66.e = jlc;
        setHierarchy(z66.a());
    }

    private void setPlaceHolderFromVideo(n10 n10) {
        Uri x = at7.x(n10.d);
        if (x != null) {
            setPlaceHolderUri(x);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.views.widgets.VideoThumbnailView, on4, android.view.View] */
    private void setPlaceHolderUri(Uri uri) {
        z66 z66 = new z66(getResources());
        z66.l = jlc.g;
        z66.b = 0;
        setHierarchy(z66.a());
        ywa a = a06.a.a();
        a.g = this.C0;
        a.l = getController();
        setController(a.a());
        tr6 a2 = tr6.a(uri);
        qcc qcc = this.C0;
        fr6 u = a06.u();
        u.getClass();
        qcc.a(new er6(u, a2, (Object) null));
    }

    public final void n(n10 n10, Drawable drawable) {
        this.B0 = n10;
        if (n10 == null && drawable == null) {
            setController((gn4) null);
        } else if (drawable == null) {
            setPlaceHolderFromVideo(n10);
        } else {
            setPlaceHolderDrawable(drawable);
        }
    }

    public final void o(n10 n10, Uri uri) {
        this.B0 = n10;
        if (n10 == null && uri == null) {
            setController((gn4) null);
        } else if (uri == null) {
            setPlaceHolderFromVideo(n10);
        } else {
            setPlaceHolderUri(uri);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.views.widgets.VideoThumbnailView, on4, android.view.View] */
    public final void onMeasure(int i, int i2) {
        if (this.B0 == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            VideoThumbnailView.super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.D0;
        if (i3 <= 0) {
            i3 = this.B0.e;
        }
        int i4 = this.E0;
        if (i4 <= 0) {
            i4 = this.B0.f;
        }
        int[] s = at7.s(size, size2, i3, i4);
        setMeasuredDimension(s[0], s[1]);
    }
}
