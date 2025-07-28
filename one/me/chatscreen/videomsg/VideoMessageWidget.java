package one.me.chatscreen.videomsg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ k77[] y0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final sy6 a = new sy6(3, (up0) null);
    public final t97 b;
    public final n0c c;
    public final n0c o;
    public ViewPropertyAnimator w0;
    public ScaleGestureDetector x0;

    static {
        Class<VideoMessageWidget> cls = VideoMessageWidget.class;
        y0 = new k77[]{new khb(cls, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0), wn6.e(m7c.a, cls, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0)};
    }

    public VideoMessageWidget() {
        super((Bundle) null, 0, 3, (x54) null);
        t97 t97 = rl2.a;
        this.b = sl2.a.getAccessor().d(j5f.class);
        this.c = viewBinding(j2a.t);
        this.o = viewBinding(j2a.v);
        this.X = ez3.O(3, new opd(29));
        this.Y = ez3.O(3, new u6f(this, 0));
        this.Z = ez3.O(3, new u6f(this, 1));
    }

    public static final void l0(VideoMessageWidget videoMessageWidget, FrameLayout frameLayout, int i, u16 u16) {
        videoMessageWidget.getClass();
        ImageView imageView = new ImageView(frameLayout.getContext());
        float f = (float) 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int X2 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        imageView.setPadding(X2, X2, X2, X2);
        urd.B(new ac2(3, (Continuation) null, 9), imageView);
        u16.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final j5f m0() {
        return (j5f) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnTouchListener(w6f.b);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        k3b k3b = new k3b(frameLayout.getContext());
        k3b.setId(j2a.t);
        float f = (float) 328;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 17;
        k3b.setLayoutParams(layoutParams2);
        k3b.setOnTouchListener(new jg1(6, this));
        k3b.setKeepScreenOn(true);
        k3b.setClipToOutline(true);
        k3b.setOutlineProvider(new i32(k3b, 7));
        frameLayout.addView(k3b);
        oo0 oo0 = new oo0(frameLayout.getContext(), 0, 10.0f, false, false);
        oo0.i = new x6f(k3b, 0);
        oo0.j = new x6f(k3b, 1);
        frameLayout.setBackground(oo0);
        l0(this, frameLayout, a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), new z6f(this, 0));
        l0(this, frameLayout, a24.X(((float) 72) * dh4.c().getDisplayMetrics().density), new z6f(this, 1));
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(j2a.u);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) this.X.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
        nge.d(nte.o, textView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), textView.getPaddingBottom());
        textView.setVisibility(8);
        textView.setText("0:02,15");
        urd.B(new wua(this, (Continuation) null, 21, false), textView);
        frameLayout.addView(textView);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        r6f m0 = m0();
        m0.getClass();
        udd.p(r6f.class.getName(), "releaseAll videoMessage", new Object[0]);
        iu1 iu1 = m0.J0;
        if (iu1 != null) {
            iu1.b.d(nb7.ON_DESTROY);
        }
        m0.J0 = null;
        m0.F0.m((Object) null, Boolean.FALSE);
        m0.y0 = null;
        e4b e4b = m0.Y;
        if (e4b != null) {
            e4b.f();
        }
        m0.Y = null;
        m0.A0 = null;
        m0.z0 = null;
        m0.w0 = null;
        k5f k5f = m0.x0;
        if (k5f != null) {
            k5f.e.release();
        }
        m0.x0 = null;
        m0.K0.compareAndSet(true, false);
        ViewPropertyAnimator viewPropertyAnimator = this.w0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x0 = null;
    }

    public final void onViewCreated(View view) {
        this.x0 = new ScaleGestureDetector(getContext(), new v6f(this));
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new c7f((Continuation) null, this), 3);
        nc7 nc7 = m0().J0;
        if (nc7 == null) {
            nc7 = getViewLifecycleOwner();
        }
        ((k3b) this.c.T0(this, y0[0])).getPreviewStreamState().e(nc7, new kv1(1, new ljc(12, this)));
        ez3.N(new ck5(wx3.e(m0().C0, getViewLifecycleOwner().R(), ob7.o), new a7f((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
