package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: jb8  reason: default package */
public final class jb8 extends fn {
    public static final /* synthetic */ int i1 = 0;
    public final ArrayList A0 = new ArrayList();
    public final ArrayList B0 = new ArrayList();
    public final Context C0;
    public boolean D0;
    public boolean E0;
    public long F0;
    public final fx G0 = new fx(10, (Object) this);
    public RecyclerView H0;
    public hb8 I0;
    public ib8 J0;
    public HashMap K0;
    public xb8 L0;
    public HashMap M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public ImageButton Q0;
    public Button R0;
    public ImageView S0;
    public View T0;
    public ImageView U0;
    public TextView V0;
    public TextView W0;
    public String X0;
    public final yb8 Y;
    public MediaControllerCompat Y0;
    public final ga8 Z;
    public final db8 Z0;
    public MediaDescriptionCompat a1;
    public cb8 b1;
    public Bitmap c1;
    public Uri d1;
    public boolean e1;
    public Bitmap f1;
    public int g1;
    public final boolean h1;
    public qb8 w0 = qb8.c;
    public xb8 x0;
    public final ArrayList y0 = new ArrayList();
    public final ArrayList z0 = new ArrayList();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jb8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.fc8.a(r3, r0)
            int r1 = defpackage.fc8.b(r3)
            r2.<init>(r3, r1)
            qb8 r3 = defpackage.qb8.c
            r2.w0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.y0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.z0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.A0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.B0 = r3
            fx r3 = new fx
            r1 = 10
            r3.<init>((int) r1, (java.lang.Object) r2)
            r2.G0 = r3
            android.content.Context r3 = r2.getContext()
            r2.C0 = r3
            yb8 r3 = defpackage.yb8.d(r3)
            r2.Y = r3
            ub8 r3 = defpackage.yb8.d
            if (r3 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            ub8 r3 = defpackage.yb8.c()
            r3.getClass()
            r0 = 1
        L_0x004e:
            r2.h1 = r0
            ga8 r3 = new ga8
            r0 = 4
            r3.<init>(r2, r0)
            r2.Z = r3
            defpackage.yb8.b()
            ub8 r3 = defpackage.yb8.c()
            xb8 r3 = r3.f()
            r2.x0 = r3
            db8 r3 = new db8
            r3.<init>(r2)
            r2.Z0 = r3
            r2.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb8.<init>(android.content.Context):void");
    }

    public final void g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            xb8 xb8 = (xb8) list.get(size);
            if (xb8.d() || !xb8.g || !xb8.h(this.w0) || this.x0 == xb8) {
                list.remove(size);
            }
        }
    }

    public final void h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.a1;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.a1;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        cb8 cb8 = this.b1;
        Bitmap bitmap = cb8 == null ? this.c1 : cb8.a;
        Uri uri2 = cb8 == null ? this.d1 : cb8.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri2, uri))) {
            cb8 cb82 = this.b1;
            if (cb82 != null) {
                cb82.cancel(true);
            }
            cb8 cb83 = new cb8(this);
            this.b1 = cb83;
            cb83.execute(new Void[0]);
        }
    }

    public final void i() {
        MediaControllerCompat mediaControllerCompat = this.Y0;
        db8 db8 = this.Z0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(db8);
            this.Y0 = null;
        }
    }

    public final void j(qb8 qb8) {
        if (qb8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.w0.equals(qb8)) {
            this.w0 = qb8;
            if (this.E0) {
                yb8 yb8 = this.Y;
                ga8 ga8 = this.Z;
                yb8.f(ga8);
                yb8.a(qb8, ga8, 1);
                m();
            }
        }
    }

    public final void k() {
        Context context = this.C0;
        int i = -1;
        int p = !context.getResources().getBoolean(zlb.is_tablet) ? -1 : pfa.p(context);
        if (context.getResources().getBoolean(zlb.is_tablet)) {
            i = -2;
        }
        getWindow().setLayout(p, i);
        this.c1 = null;
        this.d1 = null;
        h();
        l();
        n();
    }

    public final void l() {
        Bitmap bitmap;
        if ((this.L0 != null || this.N0) ? true : !this.D0) {
            this.P0 = true;
            return;
        }
        this.P0 = false;
        if (!this.x0.g() || this.x0.d()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.e1 || (((bitmap = this.f1) != null && bitmap.isRecycled()) || this.f1 == null)) {
            Bitmap bitmap2 = this.f1;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.f1);
            }
            this.U0.setVisibility(8);
            this.T0.setVisibility(8);
            this.S0.setImageBitmap((Bitmap) null);
        } else {
            this.U0.setVisibility(0);
            this.U0.setImageBitmap(this.f1);
            this.U0.setBackgroundColor(this.g1);
            this.T0.setVisibility(0);
            Bitmap bitmap3 = this.f1;
            RenderScript create = RenderScript.create(this.C0);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.S0.setImageBitmap(copy);
        }
        this.e1 = false;
        this.f1 = null;
        this.g1 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.a1;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.a1;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.getSubtitle();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z) {
            this.V0.setText(title);
        } else {
            this.V0.setText(this.X0);
        }
        if (isEmpty) {
            this.W0.setText(charSequence);
            this.W0.setVisibility(0);
            return;
        }
        this.W0.setVisibility(8);
    }

    public final void m() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.z0;
        arrayList2.clear();
        ArrayList arrayList3 = this.A0;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.x0.u));
        wb8 wb8 = this.x0.a;
        wb8.getClass();
        yb8.b();
        for (xb8 xb8 : Collections.unmodifiableList(wb8.b)) {
            x3a b = this.x0.b(xb8);
            if (b != null) {
                if (b.A()) {
                    arrayList2.add(xb8);
                }
                lb8 lb8 = (lb8) b.b;
                if (lb8 != null && lb8.e) {
                    arrayList3.add(xb8);
                }
            }
        }
        g(arrayList2);
        g(arrayList3);
        zo4 zo4 = zo4.X;
        Collections.sort(arrayList, zo4);
        Collections.sort(arrayList2, zo4);
        Collections.sort(arrayList3, zo4);
        this.I0.F();
    }

    public final void n() {
        if (!this.E0) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.F0 >= 300) {
            if ((this.L0 != null || this.N0) ? true : !this.D0) {
                this.O0 = true;
                return;
            }
            this.O0 = false;
            if (!this.x0.g() || this.x0.d()) {
                dismiss();
            }
            this.F0 = SystemClock.uptimeMillis();
            this.I0.E();
            return;
        }
        fx fxVar = this.G0;
        fxVar.removeMessages(1);
        fxVar.sendEmptyMessageAtTime(1, this.F0 + 300);
    }

    public final void o() {
        if (this.O0) {
            n();
        }
        if (this.P0) {
            l();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E0 = true;
        this.Y.a(this.w0, this.Z, 1);
        m();
        boolean z = yb8.c;
        i();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(trb.mr_cast_dialog);
        Context context = this.C0;
        int i = fc8.a;
        getWindow().getDecorView().setBackgroundColor(hq3.a(context, fc8.i(context) ? gmb.mr_dynamic_dialog_background_light : gmb.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(gob.mr_cast_close_button);
        this.Q0 = imageButton;
        imageButton.setColorFilter(-1);
        this.Q0.setOnClickListener(new bb8(this, 0));
        Button button = (Button) findViewById(gob.mr_cast_stop_button);
        this.R0 = button;
        button.setTextColor(-1);
        this.R0.setOnClickListener(new bb8(this, 1));
        this.I0 = new hb8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(gob.mr_cast_list);
        this.H0 = recyclerView;
        recyclerView.setAdapter(this.I0);
        this.H0.setLayoutManager(new LinearLayoutManager());
        this.J0 = new ib8(this, 0);
        this.K0 = new HashMap();
        this.M0 = new HashMap();
        this.S0 = (ImageView) findViewById(gob.mr_cast_meta_background);
        this.T0 = findViewById(gob.mr_cast_meta_black_scrim);
        this.U0 = (ImageView) findViewById(gob.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(gob.mr_cast_meta_title);
        this.V0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(gob.mr_cast_meta_subtitle);
        this.W0 = textView2;
        textView2.setTextColor(-1);
        this.X0 = context.getResources().getString(nub.mr_cast_dialog_title_view_placeholder);
        this.D0 = true;
        k();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E0 = false;
        this.Y.f(this.Z);
        this.G0.removeCallbacksAndMessages((Object) null);
        i();
    }
}
