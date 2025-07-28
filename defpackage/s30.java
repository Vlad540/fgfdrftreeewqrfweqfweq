package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s30  reason: default package */
public final class s30 implements zwc {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public s30(Context context, r30 r30) {
        this.a = context;
        this.b = r30;
        this.c = s30.class.getName();
        this.o = new dbc(new q30(this, 0));
        this.X = new r7e(new q30(this, 1));
    }

    public static boolean f(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList i(Context context, int i) {
        int c2 = vhe.c(context, ylb.colorControlHighlight);
        int b2 = vhe.b(context, ylb.colorButtonNormal);
        int[] iArr = vhe.b;
        int[] iArr2 = vhe.d;
        int f = j33.f(c2, i);
        return new ColorStateList(new int[][]{iArr, iArr2, vhe.c, vhe.f}, new int[]{b2, f, j33.f(c2, i), i});
    }

    public static LayerDrawable k(mbc mbc, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = mbc.f(context, eob.abc_star_black_48dp);
        Drawable f2 = mbc.f(context, eob.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void q(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(gn.c(i, gn.b));
    }

    public static qod r(s30 s30, i26 i26) {
        String str = "job" + "-" + ((AtomicInteger) s30.Y).getAndIncrement();
        qod E = xs7.E((ou3) s30.a, (hu3) null, ru3.b, i26, 1);
        x37 x37 = new x37(str, E);
        ((ConcurrentHashMap) s30.X).put(str, E);
        ((hcd) s30.o).g(x37);
        ((i26) s30.b).invoke((String) s30.c, "Adding for queue job=".concat(str));
        return E;
    }

    public void a(hwc hwc) {
        ((hcd) this.c).g(hwc);
    }

    public void b(jwc jwc) {
        boolean z = jwc instanceof hwc;
        s16 s16 = (s16) this.a;
        if (!z) {
            s16.invoke();
            return;
        }
        Object value = ((t0c) this.Y).a.getValue();
        dxa dxa = value instanceof dxa ? (dxa) value : null;
        if (dxa == null || ((hwc) jwc).c != dxa.b) {
            ((gy9) ((pk) ((t97) this.b).getValue())).I(1, ((hwc) jwc).c, (d10) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            s16.invoke();
            return;
        }
        s16.invoke();
    }

    public t0c c() {
        return (t0c) this.Y;
    }

    public void d(mi9 mi9) {
        ((grd) this.X).m((Object) null, new dxa(mi9.a, mi9.b, mi9.c));
    }

    public s0c e() {
        return (s0c) this.o;
    }

    public ghe g() {
        return new ghe(utb.oneme_login_neuro_avatars_profile_title, utb.oneme_login_neuro_avatars_profile_description, utb.oneme_login_neuro_avatars_save_button);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.y37
            if (r0 == 0) goto L_0x0013
            r0 = r6
            y37 r0 = (defpackage.y37) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            y37 r0 = new y37
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r5 = r0.X
            java.util.concurrent.ConcurrentHashMap r2 = r0.o
            wx3.H(r6)
            goto L_0x0077
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            wx3.H(r6)
            java.lang.Object r6 = r5.X
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            int r2 = r6.size()
            java.lang.String r4 = "Cancelling all jobs in queue="
            java.lang.String r2 = defpackage.wn6.h(r2, r4)
            java.lang.Object r4 = r5.b
            i26 r4 = (i26) r4
            java.lang.Object r5 = r5.c
            java.lang.String r5 = (java.lang.String) r5
            r4.invoke(r5, r2)
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0057:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            g37 r2 = (g37) r2
            r4 = 0
            r2.cancel(r4)
            goto L_0x0057
        L_0x006e:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r2 = r6
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            g37 r6 = (g37) r6
            r0.o = r2
            r0.X = r5
            r0.w0 = r3
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L_0x0077
            return r1
        L_0x0096:
            r2.clear()
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s30.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ArrayList j() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    public ArrayList l() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(j());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.X);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public ColorStateList m(Context context, int i) {
        if (i == eob.abc_edit_text_material) {
            return d8.r(context, lmb.abc_tint_edittext);
        }
        if (i == eob.abc_switch_track_mtrl_alpha) {
            return d8.r(context, lmb.abc_tint_switch_track);
        }
        if (i == eob.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d = vhe.d(context, ylb.colorSwitchThumbNormal);
            if (d == null || !d.isStateful()) {
                iArr[0] = vhe.b;
                iArr2[0] = vhe.b(context, ylb.colorSwitchThumbNormal);
                iArr[1] = vhe.e;
                iArr2[1] = vhe.c(context, ylb.colorControlActivated);
                iArr[2] = vhe.f;
                iArr2[2] = vhe.c(context, ylb.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = vhe.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = vhe.e;
                iArr2[1] = vhe.c(context, ylb.colorControlActivated);
                iArr[2] = vhe.f;
                iArr2[2] = d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == eob.abc_btn_default_mtrl_shape) {
            return i(context, vhe.c(context, ylb.colorButtonNormal));
        } else {
            if (i == eob.abc_btn_borderless_material) {
                return i(context, 0);
            }
            if (i == eob.abc_btn_colored_material) {
                return i(context, vhe.c(context, ylb.colorAccent));
            }
            if (i == eob.abc_spinner_mtrl_am_alpha || i == eob.abc_spinner_textfield_background_material) {
                return d8.r(context, lmb.abc_tint_spinner);
            }
            if (f(i, (int[]) this.b)) {
                return vhe.d(context, ylb.colorControlNormal);
            }
            if (f(i, (int[]) this.X)) {
                return d8.r(context, lmb.abc_tint_default);
            }
            if (f(i, (int[]) this.Y)) {
                return d8.r(context, lmb.abc_tint_btn_checkable);
            }
            if (i == eob.abc_seekbar_thumb_material) {
                return d8.r(context, lmb.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    public void n(int i) {
        String str = (String) this.c;
        udd.p(str, "On audio focus change, %d", new Object[]{Integer.valueOf(i)});
        r30 r30 = (r30) this.b;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    udd.q(str, "onAudioFocusChange: AUDIOFOCUS_LOSS");
                    if (r30.a() && r30.e() > 0.0f) {
                        udd.q(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop");
                        r30.pause();
                    }
                } else if (i == 1) {
                    if (!r30.a()) {
                        udd.q(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player");
                        r30.play();
                    }
                    float e = r30.e();
                    if (e > 0.0f && e < 1.0f) {
                        udd.q(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up");
                        r30.g(1.0f);
                    }
                }
            } else if (r30.a() && r30.e() > 0.0f) {
                udd.q(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
                r30.pause();
            }
        } else if (r30.a() && r30.e() > 0.0f) {
            udd.q(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            r30.g(0.2f);
        }
    }

    public void o() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.Y;
        if (audioFocusRequest != null) {
            this.Y = null;
            udd.q((String) this.c, "Release audio focus");
            dbc dbc = (dbc) this.o;
            if (dbc.a()) {
                ((Context) this.a).unregisterReceiver((BroadcastReceiver) dbc.getValue());
                dbc.b();
            }
            ((AudioManager) ((r7e) this.X).getValue()).abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public void p(int i) {
        r30 r30 = (r30) this.b;
        if (r30.e() > 0.0f && r30.a()) {
            dbc dbc = (dbc) this.o;
            boolean a2 = dbc.a();
            Context context = (Context) this.a;
            if (a2) {
                context.unregisterReceiver((BroadcastReceiver) dbc.getValue());
                dbc.b();
            }
            context.registerReceiver((BroadcastReceiver) dbc.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            AudioFocusRequest build = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(r30).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(i).build()).build();
            this.Y = build;
            udd.q((String) this.c, "Request audio focus");
            ((AudioManager) ((r7e) this.X).getValue()).requestAudioFocus(build);
        }
    }

    public s30() {
        this.a = new int[]{eob.abc_textfield_search_default_mtrl_alpha, eob.abc_textfield_default_mtrl_alpha, eob.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{eob.abc_ic_commit_search_api_mtrl_alpha, eob.abc_seekbar_tick_mark_material, eob.abc_ic_menu_share_mtrl_alpha, eob.abc_ic_menu_copy_mtrl_am_alpha, eob.abc_ic_menu_cut_mtrl_alpha, eob.abc_ic_menu_selectall_mtrl_alpha, eob.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{eob.abc_textfield_activated_mtrl_alpha, eob.abc_textfield_search_activated_mtrl_alpha, eob.abc_cab_background_top_mtrl_alpha, eob.abc_text_cursor_material, eob.abc_text_select_handle_left_mtrl, eob.abc_text_select_handle_middle_mtrl, eob.abc_text_select_handle_right_mtrl};
        this.o = new int[]{eob.abc_popup_background_mtrl_mult, eob.abc_cab_background_internal_bg, eob.abc_menu_hardkey_panel_mtrl_mult};
        this.X = new int[]{eob.abc_tab_indicator_material, eob.abc_textfield_search_material};
        this.Y = new int[]{eob.abc_btn_check_material, eob.abc_btn_radio_material, eob.abc_btn_check_material_anim, eob.abc_btn_radio_material_anim};
    }
}
