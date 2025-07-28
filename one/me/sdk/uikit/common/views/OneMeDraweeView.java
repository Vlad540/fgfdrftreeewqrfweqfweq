package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withAutoPlay", "Ljue;", "setupNewController", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
public class OneMeDraweeView extends SimpleDraweeView {
    public static final /* synthetic */ int F0 = 0;
    public final String B0 = getClass().getName();
    public final qcc C0 = new qcc();
    public final o5 D0 = new o5(3, this);
    public boolean E0;

    public OneMeDraweeView(Context context) {
        super(context);
        setupNewController(false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View, java.lang.Object] */
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            OneMeDraweeView.super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new q36(this, 12, drawable));
        } else {
            post(new p36(this, 15, drawable));
        }
    }

    public final void o(tr6 tr6, tr6 tr62) {
        o3e o3e;
        qcc qcc = this.C0;
        if (tr6 != null) {
            if (tr62 != null) {
                fr6 u = a06.u();
                u.getClass();
                o3e er6 = new er6(u, tr6, (Object) null);
                fr6 u2 = a06.u();
                u2.getClass();
                o3e = new nv6(p23.B(new o3e[]{er6, new er6(u2, tr62, (Object) null)}), false);
            } else {
                fr6 u3 = a06.u();
                u3.getClass();
                o3e = new er6(u3, tr6, (Object) null);
            }
            qcc.a(o3e);
            if (getController() == null) {
                setupNewController(this.E0);
            }
        } else if (tr62 != null) {
            fr6 u4 = a06.u();
            u4.getClass();
            qcc.a(new er6(u4, tr62, (Object) null));
            if (getController() == null) {
                setupNewController(this.E0);
            }
        } else {
            setController((gn4) null);
        }
    }

    public void p(oq6 oq6, Animatable animatable) {
    }

    public final void setupNewController(boolean z) {
        this.E0 = z;
        ywa a = a06.a.a();
        a.g = this.C0;
        a.h = this.D0;
        a.l = getController();
        a.j = z;
        setController(a.a());
    }

    public OneMeDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupNewController(false);
    }
}
