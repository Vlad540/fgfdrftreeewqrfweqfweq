package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* renamed from: ze9  reason: default package */
public final class ze9 extends v2 implements xhe {
    public ImageView A0;
    public ImageView B0;
    public ImageView C0;
    public NumericCheckButton D0;
    public FrameLayout E0;
    public ImageView F0;
    public View G0;
    public final zg4 X = zg4.b();
    public ViewGroup Y;
    public FrameLayout Z;
    public final tg o;
    public AppCompatTextView w0;
    public ProgressBar x0;
    public AppCompatImageButton y0;
    public AppCompatImageButton z0;

    public ze9(Context context, ViewStub viewStub, tg tgVar) {
        super(context);
        this.o = tgVar;
        viewStub.setLayoutResource(zrb.cl_local_media_toolbox);
        this.c = viewStub.inflate();
        n();
    }

    public static void D(ImageView imageView, boolean z, wce wce) {
        if (z) {
            imageView.setBackground(swb.H(Integer.valueOf(wce.k), (Integer) null, (Integer) null));
            imageView.setColorFilter(wce.l);
            return;
        }
        imageView.setBackground(wce.a());
        imageView.setColorFilter(wce.w);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [ru.ok.messages.media.mediabar.NumericCheckButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v9, types: [ru.ok.messages.media.mediabar.NumericCheckButton, android.view.View] */
    public final void A(ol7 ol7) {
        B(this.w0, ol7.b);
        B(this.x0, ol7.c);
        FrameLayout frameLayout = this.Z;
        float f = ol7.a ? 1.0f : 0.35f;
        boolean z = ol7.X;
        C(frameLayout, z, f);
        FrameLayout frameLayout2 = this.E0;
        boolean z2 = ol7.o;
        B(frameLayout2, z2);
        B(this.F0, !z2);
        B(this.y0, z);
        boolean z3 = z && ol7.F0;
        B(this.z0, z3);
        if (z3) {
            this.z0.setSelected(ol7.E0);
        }
        B(this.A0, ol7.Z);
        B(this.B0, ol7.x0);
        B(this.C0, ol7.w0);
        this.w0.setText(ol7.y0.a);
        if (ol7.z0) {
            this.D0.setEnabled(true);
            this.D0.setNumber(ol7.A0);
            a24.a0(this.E0, new ue9(this, 1));
        } else {
            a24.a0(this.E0, new b20(6));
            this.D0.setNumber(0);
            this.D0.setEnabled(false);
        }
        r7e r7e = wce.a0;
        wce E = fja.E((Context) this.b);
        D(this.A0, ol7.B0, E);
        D(this.C0, ol7.C0, E);
        D(this.B0, ol7.D0, E);
    }

    public final void B(View view, boolean z) {
        C(view, z, 1.0f);
    }

    public final void C(View view, boolean z, float f) {
        zbf a = eaf.a(view);
        we9 we9 = new we9(0, view, z);
        WeakReference weakReference = a.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withStartAction(we9);
        }
        if (!z) {
            f = 0.0f;
        }
        a.a(f);
        we9 we92 = new we9(1, view, z);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(we92);
        }
        a.c(this.o.a.b());
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().start();
        }
    }

    public final void c() {
        if (((View) this.c) != null) {
            r7e r7e = wce.a0;
            Context context = (Context) this.b;
            wce E = fja.E(context);
            this.Y.setBackgroundColor(E.m);
            this.G0.setBackgroundColor(E.K);
            AppCompatImageButton appCompatImageButton = this.y0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i = E.w;
            appCompatImageButton.setColorFilter(i, mode);
            this.y0.setBackground(E.a());
            this.z0.setColorFilter(i, mode);
            this.z0.setBackground(E.a());
            this.w0.setTextColor(i);
            Integer valueOf = Integer.valueOf(i);
            zg4 zg4 = this.X;
            this.Z.setBackground(swb.L(0, valueOf, Integer.valueOf(zg4.b), zg4.d));
            um4.g(this.x0.getIndeterminateDrawable(), i);
            um4.g(this.A0.getDrawable(), i);
            um4.g(this.B0.getDrawable(), i);
            um4.g(this.C0.getDrawable(), i);
            this.A0.setBackground(E.a());
            this.B0.setBackground(E.a());
            this.C0.setBackground(E.a());
            um4.g(this.F0.getDrawable(), E.k);
            this.F0.setBackground(E.a());
            Drawable mutate = gq3.b(context, zhc.n).mutate();
            um4.g(mutate, i);
            this.D0.setUncheckedBackground(mutate);
        }
    }

    public final void n() {
        this.Y = (ViewGroup) ((View) this.c).findViewById(yqb.local_media_toolbox__content);
        FrameLayout frameLayout = (FrameLayout) ((View) this.c).findViewById(yqb.local_media_toolbox__quality_container);
        this.Z = frameLayout;
        frameLayout.setOnClickListener(new ue9(this, 0));
        this.w0 = ((View) this.c).findViewById(yqb.local_media_toolbox__quality_text);
        this.x0 = (ProgressBar) ((View) this.c).findViewById(yqb.local_media_toolbox__quality_progress);
        AppCompatImageButton findViewById = ((View) this.c).findViewById(yqb.local_media_toolbox__trim_btn);
        this.y0 = findViewById;
        at7.i(findViewById, new ye9(this, 0));
        AppCompatImageButton findViewById2 = ((View) this.c).findViewById(yqb.local_media_toolbox__mute_btn);
        this.z0 = findViewById2;
        Drawable drawable = ((View) this.c).getResources().getDrawable(zhc.j0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(zhc.h0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        findViewById2.setImageDrawable(stateListDrawable);
        at7.i(this.z0, new ye9(this, 1));
        this.A0 = (ImageView) ((View) this.c).findViewById(yqb.local_media_toolbox__photo_crop_btn);
        this.B0 = (ImageView) ((View) this.c).findViewById(yqb.local_media_toolbox__photo_edit_btn);
        this.C0 = (ImageView) ((View) this.c).findViewById(yqb.local_media_toolbox__photo_filter_btn);
        at7.i(this.A0, new ye9(this, 2));
        at7.i(this.B0, new ye9(this, 3));
        at7.i(this.C0, new ye9(this, 4));
        this.D0 = (NumericCheckButton) ((View) this.c).findViewById(yqb.local_media_toolbox__btn_select);
        this.E0 = (FrameLayout) ((View) this.c).findViewById(yqb.local_media_toolbox__fl_select);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(yqb.local_media_toolbox__btn_apply);
        this.F0 = imageView;
        at7.i(imageView, new ye9(this, 5));
        this.G0 = ((View) this.c).findViewById(yqb.local_media_toolbox__separator_bottom);
        c();
        ViewGroup viewGroup = this.Y;
        ss8 ss8 = new ss8(8, (Object) this);
        WeakHashMap weakHashMap = eaf.a;
        t9f.u(viewGroup, ss8);
        r9f.c(this.Y);
    }
}
