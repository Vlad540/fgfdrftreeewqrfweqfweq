package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: hb8  reason: default package */
public final class hb8 extends f6c {
    public final AccelerateDecelerateInterpolator A0;
    public final /* synthetic */ jb8 B0;
    public final LayoutInflater X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList o = new ArrayList();
    public final Drawable w0;
    public final Drawable x0;
    public gb8 y0;
    public final int z0;

    public hb8(jb8 jb8) {
        this.B0 = jb8;
        this.X = LayoutInflater.from(jb8.C0);
        int i = tlb.mediaRouteDefaultIconDrawable;
        Context context = jb8.C0;
        this.Y = fc8.e(context, i);
        this.Z = fc8.e(context, tlb.mediaRouteTvIconDrawable);
        this.w0 = fc8.e(context, tlb.mediaRouteSpeakerIconDrawable);
        this.x0 = fc8.e(context, tlb.mediaRouteSpeakerGroupIconDrawable);
        this.z0 = context.getResources().getInteger(jrb.mr_cast_volume_slider_layout_animation_duration_ms);
        this.A0 = new AccelerateDecelerateInterpolator();
        F();
    }

    public final void C(View view, int i) {
        pa8 pa8 = new pa8(view, i, view.getLayoutParams().height, 1);
        pa8.setAnimationListener(new la8(1, this));
        pa8.setDuration((long) this.z0);
        pa8.setInterpolator(this.A0);
        view.startAnimation(pa8);
    }

    public final Drawable D(xb8 xb8) {
        Uri uri = xb8.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.B0.C0.getContentResolver().openInputStream(uri), (String) null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = xb8.m;
        return i != 1 ? i != 2 ? xb8.e() ? this.x0 : this.Y : this.w0 : this.Z;
    }

    public final void E() {
        jb8 jb8 = this.B0;
        jb8.B0.clear();
        ArrayList arrayList = jb8.B0;
        ArrayList arrayList2 = jb8.z0;
        ArrayList arrayList3 = new ArrayList();
        wb8 wb8 = jb8.x0.a;
        wb8.getClass();
        yb8.b();
        for (xb8 xb8 : Collections.unmodifiableList(wb8.b)) {
            x3a b = jb8.x0.b(xb8);
            if (b != null && b.A()) {
                arrayList3.add(xb8);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        m();
    }

    public final void F() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        jb8 jb8 = this.B0;
        this.y0 = new gb8(1, jb8.x0);
        ArrayList arrayList2 = jb8.y0;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new gb8(3, (xb8) it.next()));
            }
        } else {
            arrayList.add(new gb8(3, jb8.x0));
        }
        ArrayList arrayList3 = jb8.z0;
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                xb8 xb8 = (xb8) it2.next();
                if (!arrayList2.contains(xb8)) {
                    if (!z2) {
                        jb8.x0.getClass();
                        mb8 a = xb8.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = jb8.C0.getString(nub.mr_dialog_groupable_header);
                        }
                        arrayList.add(new gb8(2, j));
                        z2 = true;
                    }
                    arrayList.add(new gb8(3, xb8));
                }
            }
        }
        ArrayList arrayList4 = jb8.A0;
        if (!arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                xb8 xb82 = (xb8) it3.next();
                xb8 xb83 = jb8.x0;
                if (xb83 != xb82) {
                    if (!z) {
                        xb83.getClass();
                        mb8 a2 = xb8.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = jb8.C0.getString(nub.mr_dialog_transferable_header);
                        }
                        arrayList.add(new gb8(2, k));
                        z = true;
                    }
                    arrayList.add(new gb8(4, xb82));
                }
            }
        }
        E();
    }

    public final int j() {
        return this.o.size() + 1;
    }

    public final int l(int i) {
        gb8 gb8;
        if (i == 0) {
            gb8 = this.y0;
        } else {
            gb8 = (gb8) this.o.get(i - 1);
        }
        return gb8.b;
    }

    public final void r(b7c b7c, int i) {
        x3a b;
        lb8 lb8;
        ArrayList arrayList = this.o;
        int i2 = (i == 0 ? this.y0 : (gb8) arrayList.get(i - 1)).b;
        boolean z = true;
        gb8 gb8 = i == 0 ? this.y0 : (gb8) arrayList.get(i - 1);
        jb8 jb8 = this.B0;
        int i3 = 0;
        if (i2 == 1) {
            jb8.K0.put(((xb8) gb8.a).c, (e) b7c);
            f fVar = (f) b7c;
            jb8 jb82 = fVar.P0.B0;
            if (jb82.h1 && Collections.unmodifiableList(jb82.x0.u).size() > 1) {
                i3 = fVar.O0;
            }
            View view = fVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            xb8 xb8 = (xb8) gb8.a;
            fVar.A(xb8);
            fVar.N0.setText(xb8.d);
        } else if (i2 != 2) {
            float f = 1.0f;
            if (i2 == 3) {
                jb8.K0.put(((xb8) gb8.a).c, (e) b7c);
                g gVar = (g) b7c;
                xb8 xb82 = (xb8) gb8.a;
                hb8 hb8 = gVar.W0;
                jb8 jb83 = hb8.B0;
                if (xb82 == jb83.x0 && Collections.unmodifiableList(xb82.u).size() > 0) {
                    Iterator it = Collections.unmodifiableList(xb82.u).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        xb8 xb83 = (xb8) it.next();
                        if (!jb83.z0.contains(xb83)) {
                            xb82 = xb83;
                            break;
                        }
                    }
                }
                gVar.A(xb82);
                Drawable D = hb8.D(xb82);
                ImageView imageView = gVar.O0;
                imageView.setImageDrawable(D);
                gVar.Q0.setText(xb82.d);
                CheckBox checkBox = gVar.S0;
                checkBox.setVisibility(0);
                boolean D2 = gVar.D(xb82);
                boolean z2 = !jb83.B0.contains(xb82) && (!gVar.D(xb82) || Collections.unmodifiableList(jb83.x0.u).size() >= 2) && (!gVar.D(xb82) || ((b = jb83.x0.b(xb82)) != null && ((lb8 = (lb8) b.b) == null || lb8.c)));
                checkBox.setChecked(D2);
                gVar.P0.setVisibility(4);
                imageView.setVisibility(0);
                View view2 = gVar.N0;
                view2.setEnabled(z2);
                checkBox.setEnabled(z2);
                gVar.K0.setEnabled(z2 || D2);
                if (!z2 && !D2) {
                    z = false;
                }
                gVar.L0.setEnabled(z);
                jsc jsc = gVar.V0;
                view2.setOnClickListener(jsc);
                checkBox.setOnClickListener(jsc);
                if (D2 && !gVar.J0.e()) {
                    i3 = gVar.U0;
                }
                RelativeLayout relativeLayout = gVar.R0;
                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                layoutParams2.height = i3;
                relativeLayout.setLayoutParams(layoutParams2);
                float f2 = gVar.T0;
                view2.setAlpha((z2 || D2) ? 1.0f : f2);
                if (!z2 && D2) {
                    f = f2;
                }
                checkBox.setAlpha(f);
            } else if (i2 == 4) {
                eb8 eb8 = (eb8) b7c;
                xb8 xb84 = (xb8) gb8.a;
                eb8.O0 = xb84;
                ImageView imageView2 = eb8.K0;
                imageView2.setVisibility(0);
                eb8.L0.setVisibility(4);
                hb8 hb82 = eb8.P0;
                List unmodifiableList = Collections.unmodifiableList(hb82.B0.x0.u);
                if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == xb84) {
                    f = eb8.N0;
                }
                View view3 = eb8.J0;
                view3.setAlpha(f);
                view3.setOnClickListener(new jsc(8, eb8));
                imageView2.setImageDrawable(hb82.D(xb84));
                eb8.M0.setText(xb84.d);
            }
        } else {
            ((fb8) b7c).J0.setText(gb8.a.toString());
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(trb.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new fb8(layoutInflater.inflate(trb.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(trb.mr_cast_route_item, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new eb8(this, layoutInflater.inflate(trb.mr_cast_group_item, viewGroup, false));
    }

    public final void y(b7c b7c) {
        this.B0.K0.values().remove(b7c);
    }
}
