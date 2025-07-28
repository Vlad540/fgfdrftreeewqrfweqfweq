package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: jz7  reason: default package */
public final class jz7 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarPermissionWidget Y;
    public final /* synthetic */ FrameLayout Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jz7(MediaBarPermissionWidget mediaBarPermissionWidget, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarPermissionWidget;
        this.Z = frameLayout;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((jz7) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jz7 jz7 = new jz7(this.Y, this.Z, continuation);
        jz7.X = ((Boolean) obj).booleanValue();
        return jz7;
    }

    public final Object o(Object obj) {
        View view;
        wx3.H(obj);
        boolean z = this.X;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.Y;
        if (z) {
            view = ((os1) mediaBarPermissionWidget.o.getValue()).getRootView();
            a24.Z(view, 300, new iz7(mediaBarPermissionWidget, 2));
        } else {
            k77[] k77Arr = MediaBarPermissionWidget.Z;
            mediaBarPermissionWidget.getClass();
            k77 k77 = MediaBarPermissionWidget.Z[0];
            view = (LinearLayout) mediaBarPermissionWidget.c.getValue();
        }
        FrameLayout frameLayout = this.Z;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
        return jue.a;
    }
}
