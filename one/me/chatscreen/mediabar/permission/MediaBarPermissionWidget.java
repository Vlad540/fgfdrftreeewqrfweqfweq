package one.me.chatscreen.mediabar.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ k77[] Z;
    public final nl0 X;
    public final nl0 Y;
    public final t97 a;
    public final t97 b;
    public final nl0 c;
    public final nl0 o;

    static {
        Class<MediaBarPermissionWidget> cls = MediaBarPermissionWidget.class;
        khb khb = new khb(cls, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0);
        n7c n7c = m7c.a;
        Z = new k77[]{khb, wn6.e(n7c, cls, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), wn6.f(cls, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0, n7c)};
    }

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = rna.a.b();
        this.b = createViewModelLazy(gz7.class, new js5(14, new ib7(13)));
        this.c = binding(new hz7(this, 0));
        this.o = binding(new hz7(this, 1));
        this.X = binding(new hz7(this, 2));
        this.Y = binding(new hz7(this, 3));
    }

    public final void l0() {
        t97 t97 = this.a;
        if (((qna) t97.getValue()).b(qna.l)) {
            ((qna) t97.getValue()).f(new jrf(this, 1), qna.m, 157);
        } else {
            ((qna) t97.getValue()).f(new jrf(this, 1), qna.n, 162);
        }
    }

    public final void onActivityResumed(Activity activity) {
        ((gz7) this.b.getValue()).b.e();
        MediaBarPermissionWidget.super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        k77[] k77Arr = Z;
        k77 k77 = k77Arr[1];
        linearLayout.addView((FrameLayout) this.X.getValue());
        k77 k772 = k77Arr[2];
        linearLayout.addView((LinearLayout) this.Y.getValue());
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget] */
    public final void onDestroyView(View view) {
        nl0 nl0 = this.o;
        if (nl0.a()) {
            ((os1) nl0.getValue()).c();
        }
        MediaBarPermissionWidget.super.onDestroyView(view);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        t97 t97 = this.a;
        int i2 = 0;
        if (i == 157) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            jrf jrf = new jrf(this, 1);
            int i3 = k2a.Q;
            int i4 = k2a.P;
            ((qna) t97.getValue()).getClass();
            qna.j(jrf, strArr, iArr, i3, i4);
        } else if (i == 162) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            qna.l((qna) t97.getValue(), new jrf(this, 1), strArr, iArr, qna.n, k2a.O, k2a.N);
        }
    }

    public MediaBarPermissionWidget() {
        this(new Bundle(0));
    }
}
