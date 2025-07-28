package androidx.mediarouter.app;

import android.view.View;

public final class h implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton a;

    public h(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = !mediaRouteExpandCollapseButton.z0;
        mediaRouteExpandCollapseButton.z0 = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.o);
            mediaRouteExpandCollapseButton.o.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.y0);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.w0);
            mediaRouteExpandCollapseButton.w0.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.x0);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.A0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
