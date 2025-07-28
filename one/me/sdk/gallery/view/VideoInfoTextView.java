package one.me.sdk.gallery.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/gallery/view/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
public final class VideoInfoTextView extends AppCompatTextView {
    /* JADX WARNING: type inference failed for: r6v0, types: [android.widget.TextView, one.me.sdk.gallery.view.VideoInfoTextView, android.view.View] */
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        wce wce;
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context2);
        }
        setTextColor(wce.t);
        jp2.c.b(this, yq4.b);
        float f = (float) 4;
        float f2 = (float) 2;
        setPadding(a24.X(getContext().getResources().getDisplayMetrics().density * f), a24.X(getContext().getResources().getDisplayMetrics().density * f2), a24.X(getContext().getResources().getDisplayMetrics().density * f), a24.X(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(a24.X(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(swb.L(Integer.valueOf(wce.r), (Integer) null, (Integer) null, a24.X(((float) 16) * getContext().getResources().getDisplayMetrics().density)));
    }
}
