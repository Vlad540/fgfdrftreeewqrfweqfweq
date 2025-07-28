package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: fq4  reason: default package */
public final class fq4 extends ahd {
    public final /* synthetic */ int B0;
    public final Object C0;

    /* JADX WARNING: type inference failed for: r1v8, types: [l83, java.lang.Object] */
    public fq4(List list) {
        this.B0 = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        byte b = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        byte b2 = (bArr[3] & 255) | ((bArr[2] & 255) << 8);
        ? obj = new Object();
        Paint paint = new Paint();
        obj.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        obj.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        obj.c = new Canvas();
        obj.d = new iq4(719, 575, 0, 719, 0, 575);
        obj.e = new gq4(0, new int[]{0, -1, -16777216, -8421505}, l83.k(), l83.l());
        obj.f = new sq4(b, b2, 0);
        this.C0 = obj;
    }

    public final g1e b(int i, byte[] bArr, boolean z) {
        sq4 sq4;
        List list;
        tq4 tq4;
        char c;
        char c2;
        int i2;
        iq4 iq4;
        ArrayList arrayList;
        int i3;
        sq4 sq42;
        Paint paint;
        oq4 oq4;
        int i4;
        int i5;
        int i6;
        int i7;
        tw3 tw3;
        int i8 = i;
        byte[] bArr2 = bArr;
        int i9 = 0;
        Object obj = this.C0;
        int i10 = 8;
        switch (this.B0) {
            case 0:
                l83 l83 = (l83) obj;
                if (z) {
                    sq4 sq43 = (sq4) l83.f;
                    sq43.c.clear();
                    sq43.d.clear();
                    sq43.e.clear();
                    sq43.f.clear();
                    sq43.g.clear();
                    sq43.h = null;
                    sq43.i = null;
                }
                l83.getClass();
                wx1 wx1 = new wx1(bArr2, i8, 1, (byte) 0);
                while (true) {
                    int b = wx1.b();
                    sq4 = (sq4) l83.f;
                    if (b < 48 || wx1.i(i10) != 15) {
                        lq4 lq4 = (lq4) sq4.i;
                    } else {
                        int i11 = wx1.i(i10);
                        int i12 = 16;
                        int i13 = wx1.i(16);
                        int i14 = wx1.i(16);
                        int f = wx1.f() + i14;
                        if (i14 * 8 > wx1.b()) {
                            wx1.t(wx1.b());
                        } else {
                            switch (i11) {
                                case 16:
                                    if (i13 == sq4.a) {
                                        lq4 lq42 = (lq4) sq4.i;
                                        int i15 = 8;
                                        wx1.i(8);
                                        int i16 = wx1.i(4);
                                        int i17 = wx1.i(2);
                                        wx1.t(2);
                                        int i18 = i14 - 2;
                                        SparseArray sparseArray = new SparseArray();
                                        while (i18 > 0) {
                                            int i19 = wx1.i(i15);
                                            wx1.t(i15);
                                            i18 -= 6;
                                            sparseArray.put(i19, new mq4(wx1.i(16), wx1.i(16)));
                                            i15 = 8;
                                        }
                                        lq4 lq43 = new lq4(i16, i17, sparseArray);
                                        if (i17 == 0) {
                                            if (!(lq42 == null || lq42.a == i16)) {
                                                sq4.i = lq43;
                                                break;
                                            }
                                        } else {
                                            sq4.i = lq43;
                                            sq4.c.clear();
                                            sq4.d.clear();
                                            sq4.e.clear();
                                            break;
                                        }
                                    }
                                    break;
                                case 17:
                                    lq4 lq44 = (lq4) sq4.i;
                                    if (i13 == sq4.a && lq44 != null) {
                                        int i20 = wx1.i(i10);
                                        wx1.t(4);
                                        boolean h = wx1.h();
                                        wx1.t(3);
                                        int i21 = wx1.i(16);
                                        int i22 = wx1.i(16);
                                        wx1.i(3);
                                        int i23 = wx1.i(3);
                                        wx1.t(2);
                                        int i24 = wx1.i(i10);
                                        int i25 = wx1.i(i10);
                                        int i26 = wx1.i(4);
                                        int i27 = wx1.i(2);
                                        wx1.t(2);
                                        int i28 = i14 - 10;
                                        SparseArray sparseArray2 = new SparseArray();
                                        while (i28 > 0) {
                                            int i29 = wx1.i(i12);
                                            int i30 = wx1.i(2);
                                            wx1.i(2);
                                            int i31 = wx1.i(12);
                                            wx1.t(4);
                                            int i32 = wx1.i(12);
                                            int i33 = i28 - 6;
                                            if (i30 == 1 || i30 == 2) {
                                                wx1.i(8);
                                                wx1.i(8);
                                                i28 -= 8;
                                            } else {
                                                i28 = i33;
                                            }
                                            sparseArray2.put(i29, new qq4(i31, i32));
                                            i12 = 16;
                                        }
                                        oq4 oq42 = new oq4(i20, h, i21, i22, i23, i24, i25, i26, i27, sparseArray2);
                                        SparseArray sparseArray3 = sq4.c;
                                        if (lq44.b == 0 && (oq4 = (oq4) sparseArray3.get(i20)) != null) {
                                            int i34 = 0;
                                            while (true) {
                                                SparseArray sparseArray4 = oq4.j;
                                                if (i34 < sparseArray4.size()) {
                                                    oq42.j.put(sparseArray4.keyAt(i34), (qq4) sparseArray4.valueAt(i34));
                                                    i34++;
                                                }
                                            }
                                        }
                                        sparseArray3.put(oq42.a, oq42);
                                        break;
                                    }
                                case 18:
                                    if (i13 != sq4.a) {
                                        if (i13 == sq4.b) {
                                            gq4 q = l83.q(wx1, i14);
                                            sq4.f.put(q.a, q);
                                            break;
                                        }
                                    } else {
                                        gq4 q2 = l83.q(wx1, i14);
                                        sq4.d.put(q2.a, q2);
                                        break;
                                    }
                                    break;
                                case 19:
                                    if (i13 != sq4.a) {
                                        if (i13 == sq4.b) {
                                            jq4 r = l83.r(wx1);
                                            sq4.g.put(r.a, r);
                                            break;
                                        }
                                    } else {
                                        jq4 r2 = l83.r(wx1);
                                        sq4.e.put(r2.a, r2);
                                        break;
                                    }
                                    break;
                                case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                                    if (i13 == sq4.a) {
                                        wx1.t(4);
                                        boolean h2 = wx1.h();
                                        wx1.t(3);
                                        int i35 = wx1.i(16);
                                        int i36 = wx1.i(16);
                                        if (h2) {
                                            int i37 = wx1.i(16);
                                            int i38 = wx1.i(16);
                                            int i39 = wx1.i(16);
                                            i7 = i37;
                                            i4 = wx1.i(16);
                                            i6 = i38;
                                            i5 = i39;
                                        } else {
                                            i7 = i9;
                                            i5 = i7;
                                            i6 = i35;
                                            i4 = i36;
                                        }
                                        sq4.h = new iq4(i35, i36, i7, i6, i5, i4);
                                        break;
                                    }
                                    break;
                            }
                            wx1.u(f - wx1.f());
                        }
                        i9 = 0;
                        i10 = 8;
                    }
                }
                lq4 lq45 = (lq4) sq4.i;
                if (lq45 == null) {
                    list = Collections.emptyList();
                } else {
                    iq4 iq42 = (iq4) sq4.h;
                    if (iq42 == null) {
                        iq42 = (iq4) l83.d;
                    }
                    Bitmap bitmap = (Bitmap) l83.g;
                    Canvas canvas = (Canvas) l83.c;
                    if (!(bitmap != null && iq42.a + 1 == bitmap.getWidth() && iq42.b + 1 == ((Bitmap) l83.g).getHeight())) {
                        Bitmap createBitmap = Bitmap.createBitmap(iq42.a + 1, iq42.b + 1, Bitmap.Config.ARGB_8888);
                        l83.g = createBitmap;
                        canvas.setBitmap(createBitmap);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i40 = 0;
                    while (true) {
                        SparseArray sparseArray5 = lq45.c;
                        if (i40 < sparseArray5.size()) {
                            canvas.save();
                            mq4 mq4 = (mq4) sparseArray5.valueAt(i40);
                            oq4 oq43 = (oq4) sq4.c.get(sparseArray5.keyAt(i40));
                            int i41 = mq4.a + iq42.c;
                            int i42 = mq4.b + iq42.e;
                            int min = Math.min(oq43.c + i41, iq42.d);
                            int i43 = oq43.d;
                            int i44 = i42 + i43;
                            canvas.clipRect(i41, i42, min, Math.min(i44, iq42.f));
                            SparseArray sparseArray6 = sq4.d;
                            int i45 = oq43.f;
                            gq4 gq4 = (gq4) sparseArray6.get(i45);
                            if (gq4 == null && (gq4 = (gq4) sq4.f.get(i45)) == null) {
                                gq4 = (gq4) l83.e;
                            }
                            int i46 = 0;
                            while (true) {
                                SparseArray sparseArray7 = oq43.j;
                                lq4 lq46 = lq45;
                                if (i46 < sparseArray7.size()) {
                                    int keyAt = sparseArray7.keyAt(i46);
                                    qq4 qq4 = (qq4) sparseArray7.valueAt(i46);
                                    tq4 tq42 = tq4;
                                    jq4 jq4 = (jq4) sq4.e.get(keyAt);
                                    if (jq4 == null) {
                                        jq4 = (jq4) sq4.g.get(keyAt);
                                    }
                                    if (jq4 != null) {
                                        if (jq4.b) {
                                            sq42 = sq4;
                                            paint = null;
                                        } else {
                                            paint = (Paint) l83.a;
                                            sq42 = sq4;
                                        }
                                        int i47 = qq4.a + i41;
                                        int i48 = qq4.b + i42;
                                        i3 = i40;
                                        int i49 = oq43.e;
                                        arrayList = arrayList2;
                                        iq4 = iq42;
                                        int[] iArr = i49 == 3 ? gq4.d : i49 == 2 ? gq4.c : gq4.b;
                                        int i50 = i49;
                                        int i51 = i47;
                                        Paint paint2 = paint;
                                        Canvas canvas2 = canvas;
                                        l83.p(jq4.c, iArr, i50, i51, i48, paint2, canvas2);
                                        l83.p(jq4.d, iArr, i50, i51, i48 + 1, paint2, canvas2);
                                    } else {
                                        iq4 = iq42;
                                        arrayList = arrayList2;
                                        i3 = i40;
                                        sq42 = sq4;
                                    }
                                    i46++;
                                    lq45 = lq46;
                                    sq4 = sq42;
                                    tq4 = tq42;
                                    i40 = i3;
                                    arrayList2 = arrayList;
                                    iq42 = iq4;
                                } else {
                                    tq4 tq43 = tq4;
                                    iq4 iq43 = iq42;
                                    ArrayList arrayList3 = arrayList2;
                                    int i52 = i40;
                                    sq4 sq44 = sq4;
                                    boolean z2 = oq43.b;
                                    int i53 = oq43.c;
                                    if (z2) {
                                        int i54 = oq43.e;
                                        c2 = 3;
                                        if (i54 == 3) {
                                            i2 = gq4.d[oq43.g];
                                            c = 2;
                                        } else {
                                            c = 2;
                                            i2 = i54 == 2 ? gq4.c[oq43.h] : gq4.b[oq43.i];
                                        }
                                        Paint paint3 = (Paint) l83.b;
                                        paint3.setColor(i2);
                                        canvas.drawRect((float) i41, (float) i42, (float) (i41 + i53), (float) i44, paint3);
                                    } else {
                                        c2 = 3;
                                        c = 2;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) l83.g, i41, i42, i53, i43);
                                    iq4 iq44 = iq43;
                                    float f2 = (float) iq44.a;
                                    float f3 = (float) iq44.b;
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.add(new tw3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i42) / f3, 0, 0, ((float) i41) / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, ((float) i53) / f2, ((float) i43) / f3, false, -16777216, Integer.MIN_VALUE, 0.0f));
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    canvas.restore();
                                    i40 = i52 + 1;
                                    sq4 = sq44;
                                    char c3 = c2;
                                    iq42 = iq44;
                                    char c4 = c;
                                    tq4 = tq43;
                                    arrayList2 = arrayList4;
                                    lq45 = lq46;
                                }
                            }
                        } else {
                            tq4 tq44 = tq4;
                            list = Collections.unmodifiableList(arrayList2);
                        }
                    }
                }
                return new tq4(list);
            default:
                yze yze = (yze) obj;
                yze.F(i8, bArr2);
                ArrayList arrayList5 = new ArrayList();
                while (yze.c() > 0) {
                    if (yze.c() >= 8) {
                        int h3 = yze.h();
                        if (yze.h() == 1987343459) {
                            int i55 = h3 - 8;
                            CharSequence charSequence = null;
                            rw3 rw3 = null;
                            while (i55 > 0) {
                                if (i55 >= 8) {
                                    int h4 = yze.h();
                                    int h5 = yze.h();
                                    int i56 = h4 - 8;
                                    byte[] bArr3 = yze.a;
                                    int i57 = yze.b;
                                    int i58 = mze.a;
                                    String str = new String(bArr3, i57, i56, f22.c);
                                    yze.I(i56);
                                    i55 = (i55 - 8) - i56;
                                    if (h5 == 1937011815) {
                                        qqf qqf = new qqf();
                                        rqf.e(str, qqf);
                                        rw3 = qqf.a();
                                    } else if (h5 == 1885436268) {
                                        charSequence = rqf.f((String) null, str.trim(), Collections.emptyList());
                                    }
                                } else {
                                    throw new Exception("Incomplete vtt cue box header found.");
                                }
                            }
                            if (charSequence == null) {
                                charSequence = BuildConfig.FLAVOR;
                            }
                            if (rw3 != null) {
                                rw3.a = charSequence;
                                tw3 = rw3.a();
                            } else {
                                Pattern pattern = rqf.a;
                                qqf qqf2 = new qqf();
                                qqf2.c = charSequence;
                                tw3 = qqf2.a().a();
                            }
                            arrayList5.add(tw3);
                        } else {
                            yze.I(h3 - 8);
                        }
                    } else {
                        throw new Exception("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                }
                return new tq4(arrayList5);
        }
    }

    public fq4() {
        this.B0 = 1;
        this.C0 = new yze(3, false);
    }
}
