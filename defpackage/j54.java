package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.camera.core.ImageCaptureException;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: j54  reason: default package */
public final class j54 implements lg, h1e {
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public j54(t97 t97, t97 t972, t97 t973, Set set) {
        this.a = t973;
        this.b = set;
        this.c = t97;
        this.o = t972;
        AtomicReference atomicReference = new AtomicReference(qw4.a);
        this.X = atomicReference;
        if (!set.isEmpty()) {
            atomicReference.updateAndGet(new at5(this, 1, new LinkedHashSet()));
        }
    }

    public void A(int i) {
        long[] jArr = (long[]) this.X;
        if (jArr == null) {
            this.X = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.X = Arrays.copyOf((long[]) this.X, Math.max(jArr.length * 2, i));
        }
    }

    public void B(int i, int i2, cj5 cj5, int i3, int i4, boolean z) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        double d;
        int i9;
        int i10;
        double d2;
        cj5 cj52 = cj5;
        int i11 = i3;
        float f = cj52.f;
        boolean z3 = false;
        if (f > 0.0f && i11 >= (i5 = cj52.a)) {
            float f2 = ((float) (i11 - i5)) / f;
            cj52.a = i4 + cj52.b;
            if (!z) {
                cj52.c = Integer.MIN_VALUE;
            }
            int i12 = 0;
            boolean z4 = false;
            int i13 = 0;
            float f3 = 0.0f;
            while (i12 < cj52.d) {
                int i14 = cj52.k + i12;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((aj5) this.a);
                View Z0 = flexboxLayoutManager.Z0(i14);
                if (Z0 == null || Z0.getVisibility() == 8) {
                    int i15 = i2;
                    z2 = z3;
                    i7 = i5;
                    i6 = i12;
                } else {
                    bj5 bj5 = (bj5) Z0.getLayoutParams();
                    int i16 = flexboxLayoutManager.p;
                    if (i16 == 0 || i16 == 1) {
                        int i17 = i;
                        int i18 = i5;
                        i6 = i12;
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr = (long[]) this.X;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i14];
                        }
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.X;
                        if (jArr2 != null) {
                            long j = jArr2[i14];
                            i7 = i18;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i7 = i18;
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            ej5 ej5 = (ej5) bj5;
                            float f4 = ej5.X;
                            z2 = false;
                            if (f4 > 0.0f) {
                                float f5 = (f2 * f4) + ((float) measuredWidth);
                                if (i6 == cj52.d - 1) {
                                    f5 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f5);
                                int i19 = ej5.z0;
                                if (round > i19) {
                                    ((boolean[]) this.b)[i14] = true;
                                    cj52.f -= f4;
                                    round = i19;
                                    z4 = true;
                                } else {
                                    float f6 = (f5 - ((float) round)) + f3;
                                    double d3 = (double) f6;
                                    if (d3 > 1.0d) {
                                        round++;
                                        d = d3 - 1.0d;
                                    } else {
                                        if (d3 < -1.0d) {
                                            round--;
                                            d = d3 + 1.0d;
                                        }
                                        f3 = f6;
                                    }
                                    f6 = (float) d;
                                    f3 = f6;
                                }
                                int D = D(i2, bj5, cj52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Z0.measure(makeMeasureSpec, D);
                                int measuredWidth2 = Z0.getMeasuredWidth();
                                int measuredHeight2 = Z0.getMeasuredHeight();
                                P(Z0, i14, makeMeasureSpec, D);
                                flexboxLayoutManager.k1(Z0, i14);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i20 = i2;
                            }
                        } else {
                            int i21 = i2;
                            z2 = false;
                        }
                        ej5 ej52 = (ej5) bj5;
                        int max = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredHeight + ej52.topMargin + ej52.bottomMargin);
                        cj52.a = measuredWidth + ej52.leftMargin + ej52.rightMargin + cj52.a;
                        i8 = max;
                    } else {
                        int measuredHeight3 = Z0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.X;
                        if (jArr3 != null) {
                            long j2 = jArr3[i14];
                            i9 = i5;
                            measuredHeight3 = (int) (j2 >> 32);
                        } else {
                            i9 = i5;
                        }
                        int measuredWidth3 = Z0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.X;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i14];
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            ej5 ej53 = (ej5) bj5;
                            float f7 = ej53.X;
                            if (f7 > 0.0f) {
                                float f8 = (f2 * f7) + ((float) measuredHeight3);
                                if (i12 == cj52.d - 1) {
                                    f8 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(f8);
                                int i22 = ej53.A0;
                                if (round2 > i22) {
                                    ((boolean[]) this.b)[i14] = true;
                                    cj52.f -= f7;
                                    i10 = i9;
                                    round2 = i22;
                                    z4 = true;
                                    i6 = i12;
                                } else {
                                    float f9 = (f8 - ((float) round2)) + f3;
                                    i6 = i12;
                                    i10 = i9;
                                    double d4 = (double) f9;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        d2 = d4 - 1.0d;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        d2 = d4 + 1.0d;
                                    } else {
                                        f3 = f9;
                                    }
                                    f3 = (float) d2;
                                }
                                int E = E(i, bj5, cj52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Z0.measure(E, makeMeasureSpec2);
                                int measuredWidth4 = Z0.getMeasuredWidth();
                                int measuredHeight4 = Z0.getMeasuredHeight();
                                P(Z0, i14, E, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Z0, i14);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                ej5 ej54 = (ej5) bj5;
                                i8 = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + ej54.leftMargin + ej54.rightMargin);
                                cj52.a = measuredHeight3 + ej54.topMargin + ej54.bottomMargin + cj52.a;
                                int i23 = i2;
                                i7 = i10;
                                z2 = false;
                            }
                        }
                        i6 = i12;
                        i10 = i9;
                        int i24 = i;
                        ej5 ej542 = (ej5) bj5;
                        i8 = Math.max(i13, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + ej542.leftMargin + ej542.rightMargin);
                        cj52.a = measuredHeight3 + ej542.topMargin + ej542.bottomMargin + cj52.a;
                        int i232 = i2;
                        i7 = i10;
                        z2 = false;
                    }
                    cj52.c = Math.max(cj52.c, i8);
                    i13 = i8;
                }
                i12 = i6 + 1;
                i5 = i7;
                z3 = z2;
                int i25 = i3;
            }
            int i26 = i2;
            int i27 = i5;
            if (z4 && i27 != cj52.a) {
                B(i, i2, cj5, i3, i4, true);
            }
        }
    }

    public int C() {
        int l;
        gt0.i();
        e07.p("The ImageReader is not initialized.", ((yic) this.b) != null);
        yic yic = (yic) this.b;
        synchronized (yic.a) {
            l = yic.o.l() - yic.b;
        }
        return l;
    }

    public int D(int i, bj5 bj5, int i2) {
        aj5 aj5 = (aj5) this.a;
        a aVar = (a) aj5;
        ej5 ej5 = (ej5) bj5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aj5;
        int x = a.x(flexboxLayoutManager.f(), flexboxLayoutManager.o, flexboxLayoutManager.m, aVar.I() + aVar.L() + ej5.topMargin + ej5.bottomMargin + i2, ej5.height);
        int size = View.MeasureSpec.getSize(x);
        int i3 = ej5.A0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = ej5.y0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public int E(int i, bj5 bj5, int i2) {
        aj5 aj5 = (aj5) this.a;
        a aVar = (a) aj5;
        ej5 ej5 = (ej5) bj5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aj5;
        int x = a.x(flexboxLayoutManager.e(), flexboxLayoutManager.n, flexboxLayoutManager.l, aVar.K() + aVar.J() + ej5.leftMargin + ej5.rightMargin + i2, ej5.width);
        int size = View.MeasureSpec.getSize(x);
        int i3 = ej5.z0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = ej5.x0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public Object F(Continuation continuation) {
        return xs7.U(((pae) ((t97) this.o).getValue()).b(), new bxc(this, (Continuation) null), continuation);
    }

    public void G(View view, cj5 cj5, int i, int i2, int i3, int i4) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((aj5) this.a);
        int i5 = flexboxLayoutManager.r;
        ej5 ej5 = (ej5) ((bj5) view.getLayoutParams());
        int i6 = ej5.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = cj5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int measuredHeight = (((i7 - view.getMeasuredHeight()) + ej5.topMargin) - ej5.bottomMargin) / 2;
                    if (flexboxLayoutManager.q != 2) {
                        int i8 = i2 + measuredHeight;
                        view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                        return;
                    }
                    int i9 = i2 - measuredHeight;
                    view.layout(i, i9, i3, view.getMeasuredHeight() + i9);
                    return;
                } else if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                } else if (flexboxLayoutManager.q != 2) {
                    int max = Math.max(cj5.h - view.getBaseline(), ej5.topMargin);
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (cj5.h - view.getMeasuredHeight()), ej5.bottomMargin);
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (flexboxLayoutManager.q != 2) {
                int i10 = i2 + i7;
                int i11 = ej5.bottomMargin;
                view.layout(i, (i10 - view.getMeasuredHeight()) - i11, i3, i10 - i11);
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i7) + ej5.topMargin, i3, view.getMeasuredHeight() + (i4 - i7) + ej5.topMargin);
                return;
            }
        }
        if (flexboxLayoutManager.q != 2) {
            int i12 = ej5.topMargin;
            view.layout(i, i2 + i12, i3, i4 + i12);
            return;
        }
        int i13 = ej5.bottomMargin;
        view.layout(i, i2 - i13, i3, i4 - i13);
    }

    public void H(View view, cj5 cj5, boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((FlexboxLayoutManager) ((aj5) this.a)).r;
        ej5 ej5 = (ej5) ((bj5) view.getLayoutParams());
        int i6 = ej5.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = cj5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i7 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + marginStart, i2, i3 + marginStart, i4);
                        return;
                    } else {
                        view.layout(i - marginStart, i2, i3 - marginStart, i4);
                        return;
                    }
                } else if (!(i5 == 3 || i5 == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i7) - view.getMeasuredWidth()) - ej5.rightMargin, i2, ((i3 + i7) - view.getMeasuredWidth()) - ej5.rightMargin, i4);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i - i7) + ej5.leftMargin, i2, view.getMeasuredWidth() + (i3 - i7) + ej5.leftMargin, i4);
                return;
            }
        }
        if (!z) {
            int i8 = ej5.leftMargin;
            view.layout(i + i8, i2, i3 + i8, i4);
            return;
        }
        int i9 = ej5.rightMargin;
        view.layout(i - i9, i2, i3 - i9, i4);
    }

    public void I(lr6 lr6) {
        gt0.i();
        if (((s4b) this.a) == null) {
            Objects.toString(lr6);
            lr6.close();
            return;
        }
        s9e e = lr6.getImageInfo().e();
        if (((Integer) e.a.get(((s4b) this.a).g)) == null) {
            lr6.close();
            return;
        }
        gt0.i();
        ia0 ia0 = (ia0) this.c;
        Objects.requireNonNull(ia0);
        ia0.a.accept(new ja0((s4b) this.a, lr6));
        s4b s4b = (s4b) this.a;
        this.a = null;
        int i = s4b.j;
        xac xac = s4b.f;
        if (!(i == -1 || i == 100)) {
            s4b.j = 100;
            xac.getClass();
            gt0.i();
            if (!xac.g) {
                fb0 fb0 = xac.a;
                fb0.getClass();
                fb0.b.execute(new aae(fb0));
            }
        }
        xac.getClass();
        gt0.i();
        if (!xac.g) {
            if (!xac.h) {
                gt0.i();
                if (!xac.g && !xac.h) {
                    xac.h = true;
                    lv1 lv1 = xac.a.c;
                }
            }
            xac.e.b((Object) null);
        }
    }

    public void J(s4b s4b) {
        gt0.i();
        boolean z = false;
        e07.p("only one capture stage is supported.", s4b.h.size() == 1);
        if (C() > 0) {
            z = true;
        }
        e07.p("Too many acquire images. Close image to be able to process next.", z);
        this.a = s4b;
        ct0.a(s4b.i, new b2b((Object) this, 10, (Object) s4b), pa2.j());
    }

    public void K(eb0 eb0) {
        boolean z;
        gt0.i();
        s4b s4b = (s4b) this.a;
        if (s4b != null && s4b.a == eb0.a) {
            xac xac = s4b.f;
            xac.getClass();
            gt0.i();
            if (!xac.g) {
                fb0 fb0 = xac.a;
                fb0.getClass();
                gt0.i();
                int i = fb0.a;
                if (i > 0) {
                    z = true;
                    fb0.a = i - 1;
                } else {
                    z = false;
                }
                ImageCaptureException imageCaptureException = eb0.b;
                if (!z) {
                    gt0.i();
                    fb0.getClass();
                    fb0.b.execute(new sbc(fb0, 27, imageCaptureException));
                }
                xac.a();
                xac.e.d(imageCaptureException);
                if (z) {
                    z9e z9e = xac.b;
                    z9e.getClass();
                    gt0.i();
                    z9e.a.addFirst(fb0);
                    z9e.c();
                }
            }
        }
    }

    public void L(int i, int i2, cj5 cj5, int i3, int i4, boolean z) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        cj5 cj52 = cj5;
        int i9 = i3;
        int i10 = cj52.a;
        float f = cj52.g;
        boolean z3 = false;
        if (f > 0.0f && i9 <= i10) {
            float f2 = ((float) (i10 - i9)) / f;
            cj52.a = i4 + cj52.b;
            if (!z) {
                cj52.c = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z4 = false;
            int i12 = 0;
            float f3 = 0.0f;
            while (i11 < cj52.d) {
                int i13 = cj52.k + i11;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((aj5) this.a);
                View Z0 = flexboxLayoutManager.Z0(i13);
                if (Z0 == null || Z0.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i11;
                    z2 = z3;
                    i5 = i10;
                } else {
                    bj5 bj5 = (bj5) Z0.getLayoutParams();
                    int i15 = flexboxLayoutManager.p;
                    if (i15 == 0 || i15 == 1) {
                        i5 = i10;
                        int i16 = i11;
                        int i17 = i;
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr = (long[]) this.X;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.X;
                        if (jArr2 != null) {
                            long j = jArr2[i13];
                            i6 = i16;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i6 = i16;
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            ej5 ej5 = (ej5) bj5;
                            float f4 = ej5.Y;
                            z2 = false;
                            if (f4 > 0.0f) {
                                float f5 = ((float) measuredWidth) - (f2 * f4);
                                if (i6 == cj52.d - 1) {
                                    f5 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f5);
                                int i18 = ej5.x0;
                                if (round < i18) {
                                    ((boolean[]) this.b)[i13] = true;
                                    cj52.g -= f4;
                                    z4 = true;
                                    round = i18;
                                } else {
                                    float f6 = (f5 - ((float) round)) + f3;
                                    double d = (double) f6;
                                    if (d > 1.0d) {
                                        round++;
                                        f6 -= 1.0f;
                                    } else if (d < -1.0d) {
                                        round--;
                                        f6 += 1.0f;
                                    }
                                    f3 = f6;
                                }
                                int D = D(i2, bj5, cj52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Z0.measure(makeMeasureSpec, D);
                                int measuredWidth2 = Z0.getMeasuredWidth();
                                int measuredHeight2 = Z0.getMeasuredHeight();
                                P(Z0, i13, makeMeasureSpec, D);
                                flexboxLayoutManager.k1(Z0, i13);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i19 = i2;
                            }
                        } else {
                            int i20 = i2;
                            z2 = false;
                        }
                        ej5 ej52 = (ej5) bj5;
                        int max = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredHeight + ej52.topMargin + ej52.bottomMargin);
                        cj52.a = measuredWidth + ej52.leftMargin + ej52.rightMargin + cj52.a;
                        i7 = max;
                    } else {
                        int measuredHeight3 = Z0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.X;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i13] >> 32);
                        }
                        int measuredWidth3 = Z0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.X;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i13];
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            ej5 ej53 = (ej5) bj5;
                            float f7 = ej53.Y;
                            if (f7 > 0.0f) {
                                float f8 = ((float) measuredHeight3) - (f2 * f7);
                                if (i11 == cj52.d - 1) {
                                    f8 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(f8);
                                int i21 = ej53.y0;
                                if (round2 < i21) {
                                    ((boolean[]) this.b)[i13] = true;
                                    cj52.g -= f7;
                                    i8 = i11;
                                    round2 = i21;
                                    z4 = true;
                                    i5 = i10;
                                } else {
                                    float f9 = (f8 - ((float) round2)) + f3;
                                    i5 = i10;
                                    i8 = i11;
                                    double d2 = (double) f9;
                                    if (d2 > 1.0d) {
                                        round2++;
                                        f9 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round2--;
                                        f9 += 1.0f;
                                    }
                                    f3 = f9;
                                }
                                int E = E(i, bj5, cj52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Z0.measure(E, makeMeasureSpec2);
                                int measuredWidth4 = Z0.getMeasuredWidth();
                                int measuredHeight4 = Z0.getMeasuredHeight();
                                P(Z0, i13, E, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Z0, i13);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                ej5 ej54 = (ej5) bj5;
                                i7 = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + ej54.leftMargin + ej54.rightMargin);
                                cj52.a = measuredHeight3 + ej54.topMargin + ej54.bottomMargin + cj52.a;
                                int i22 = i2;
                                i6 = i8;
                                z2 = false;
                            }
                        }
                        i5 = i10;
                        i8 = i11;
                        int i23 = i;
                        ej5 ej542 = (ej5) bj5;
                        i7 = Math.max(i12, flexboxLayoutManager.Y0(Z0) + measuredWidth3 + ej542.leftMargin + ej542.rightMargin);
                        cj52.a = measuredHeight3 + ej542.topMargin + ej542.bottomMargin + cj52.a;
                        int i222 = i2;
                        i6 = i8;
                        z2 = false;
                    }
                    cj52.c = Math.max(cj52.c, i7);
                    i12 = i7;
                }
                i11 = i6 + 1;
                int i24 = i3;
                i10 = i5;
                z3 = z2;
            }
            int i25 = i2;
            int i26 = i10;
            if (z4 && i26 != cj52.a) {
                L(i, i2, cj5, i3, i4, true);
            }
        }
    }

    public void M(View view, int i, int i2) {
        bj5 bj5 = (bj5) view.getLayoutParams();
        ej5 ej5 = (ej5) bj5;
        int i3 = (i - ((ej5) bj5).leftMargin) - ej5.rightMargin;
        aj5 aj5 = (aj5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) aj5).Y0(view), ej5.x0), ej5.z0);
        long[] jArr = (long[]) this.X;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        P(view, i2, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) aj5).k1(view, i2);
    }

    public void N(View view, int i, int i2) {
        bj5 bj5 = (bj5) view.getLayoutParams();
        ej5 ej5 = (ej5) bj5;
        int i3 = (i - ((ej5) bj5).topMargin) - ej5.bottomMargin;
        aj5 aj5 = (aj5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) aj5).Y0(view), ej5.y0), ej5.A0);
        long[] jArr = (long[]) this.X;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        P(view, i2, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) aj5).k1(view, i2);
    }

    public void O(int i) {
        View Z0;
        int i2;
        int i3 = i;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((aj5) this.a);
        if (i3 < flexboxLayoutManager.y.b()) {
            int i4 = flexboxLayoutManager.p;
            if (flexboxLayoutManager.r == 4) {
                int[] iArr = (int[]) this.c;
                List list = flexboxLayoutManager.v;
                int size = list.size();
                for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size; i5++) {
                    cj5 cj5 = (cj5) list.get(i5);
                    int i6 = cj5.d;
                    for (int i7 = 0; i7 < i6; i7++) {
                        int i8 = cj5.k + i7;
                        if (i7 < flexboxLayoutManager.y.b() && (Z0 = flexboxLayoutManager.Z0(i8)) != null && Z0.getVisibility() != 8 && ((i2 = ((ej5) ((bj5) Z0.getLayoutParams())).Z) == -1 || i2 == 4)) {
                            if (i4 == 0 || i4 == 1) {
                                N(Z0, cj5.c, i8);
                            } else if (i4 == 2 || i4 == 3) {
                                M(Z0, cj5.c, i8);
                            } else {
                                throw new IllegalArgumentException(wn6.h(i4, "Invalid flex direction: "));
                            }
                        }
                    }
                }
                return;
            }
            for (cj5 cj52 : flexboxLayoutManager.v) {
                Iterator it = cj52.j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View Z02 = flexboxLayoutManager.Z0(num.intValue());
                        if (i4 == 0 || i4 == 1) {
                            N(Z02, cj52.c, num.intValue());
                        } else if (i4 == 2 || i4 == 3) {
                            M(Z02, cj52.c, num.intValue());
                        } else {
                            throw new IllegalArgumentException(wn6.h(i4, "Invalid flex direction: "));
                        }
                    }
                }
            }
        }
    }

    public void P(View view, int i, int i2, int i3) {
        long[] jArr = (long[]) this.o;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.X;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public qe4 a(View view) {
        return new qe4(view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(f()).setDuration(200).withStartAction(new mg(view, 1)));
    }

    public long b() {
        return 200;
    }

    public qe4 c(View view) {
        return new qe4(view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(n()).setDuration(200).withEndAction(new mg(view, 3)));
    }

    public Interpolator d() {
        if (((o85) this.b) == null) {
            this.b = new o85(1);
        }
        return (o85) this.b;
    }

    public qe4 e(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(2, view));
        view.startAnimation(translateAnimation);
        return new qe4(translateAnimation);
    }

    public Interpolator f() {
        if (((OvershootInterpolator) this.X) == null) {
            this.X = new OvershootInterpolator();
        }
        return (OvershootInterpolator) this.X;
    }

    public qe4 g(View view) {
        return new qe4(view.animate().alpha(0.0f).setInterpolator(n()).setDuration(200).withEndAction(new mg(view, 2)));
    }

    public int h(long j) {
        long[] jArr = (long[]) this.b;
        int b2 = oze.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public long i() {
        return 150;
    }

    public qe4 j(View view) {
        return new qe4(view.animate().alpha(1.0f).setInterpolator(d()).setDuration(200).withStartAction(new mg(view, 0)));
    }

    public long k(int i) {
        return ((long[]) this.b)[i];
    }

    public qe4 l(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(0, view));
        view.startAnimation(translateAnimation);
        return new qe4(translateAnimation);
    }

    public Interpolator m() {
        if (((LinearInterpolator) this.a) == null) {
            this.a = new LinearInterpolator();
        }
        return (LinearInterpolator) this.a;
    }

    public Interpolator n() {
        if (((o85) this.c) == null) {
            this.c = new o85(0);
        }
        return (o85) this.c;
    }

    public qe4 o(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setInterpolator(n());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(1, view));
        view.startAnimation(translateAnimation);
        return new qe4(translateAnimation);
    }

    public Interpolator p() {
        if (((p85) this.o) == null) {
            this.o = new p85();
        }
        return (p85) this.o;
    }

    public List q(long j) {
        use use = (use) this.a;
        use.getClass();
        ArrayList arrayList = new ArrayList();
        use.g(j, use.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        use.i(j2, false, use.h, treeMap);
        Map map = (Map) this.o;
        use.h(j2, (Map) this.c, map, use.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.X).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                xse xse = (xse) map.get(pair.first);
                xse.getClass();
                arrayList2.add(new uw3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, xse.c, 0, xse.e, xse.b, 0, Integer.MIN_VALUE, -3.4028235E38f, xse.f, xse.g, false, -16777216, xse.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            xse xse2 = (xse) map.get(entry.getKey());
            xse2.getClass();
            sw3 sw3 = (sw3) entry.getValue();
            CharSequence charSequence = sw3.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ie4 ie4 : (ie4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ie4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ie4), spannableStringBuilder.getSpanEnd(ie4), BuildConfig.FLAVOR);
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            sw3.e = xse2.c;
            sw3.f = xse2.d;
            sw3.g = xse2.e;
            sw3.h = xse2.b;
            sw3.l = xse2.f;
            sw3.k = xse2.i;
            sw3.j = xse2.h;
            sw3.p = xse2.j;
            arrayList2.add(sw3.a());
        }
        return arrayList2;
    }

    public qe4 r(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setInterpolator(n());
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(new ng(3, view));
        view.startAnimation(translateAnimation);
        return new qe4(translateAnimation);
    }

    public void s(List list, cj5 cj5, int i, int i2) {
        cj5.i = i2;
        ((aj5) this.a).getClass();
        cj5.l = i;
        list.add(cj5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(defpackage.ea6 r26, int r27, int r28, int r29, int r30, int r31, java.util.List r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r31
            java.lang.Object r3 = r0.a
            aj5 r3 = (defpackage.aj5) r3
            r4 = r3
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            boolean r5 = r4.d1()
            int r6 = android.view.View.MeasureSpec.getMode(r27)
            int r7 = android.view.View.MeasureSpec.getSize(r27)
            if (r32 != 0) goto L_0x0021
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r26
            goto L_0x0025
        L_0x0021:
            r9 = r26
            r8 = r32
        L_0x0025:
            r9.b = r8
            r10 = -1
            if (r1 != r10) goto L_0x002c
            r11 = 1
            goto L_0x002d
        L_0x002c:
            r11 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x003f
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            androidx.recyclerview.widget.RecyclerView r12 = r12.b
            if (r12 == 0) goto L_0x003d
            java.util.WeakHashMap r13 = defpackage.eaf.a
            int r12 = r12.getPaddingStart()
            goto L_0x0046
        L_0x003d:
            r12 = 0
            goto L_0x0046
        L_0x003f:
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            int r12 = r12.L()
        L_0x0046:
            if (r5 == 0) goto L_0x0058
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.b
            if (r13 == 0) goto L_0x0056
            java.util.WeakHashMap r14 = defpackage.eaf.a
            int r13 = r13.getPaddingEnd()
            goto L_0x005f
        L_0x0056:
            r13 = 0
            goto L_0x005f
        L_0x0058:
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            int r13 = r13.I()
        L_0x005f:
            if (r5 == 0) goto L_0x0069
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            int r14 = r14.L()
            goto L_0x0078
        L_0x0069:
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.RecyclerView r14 = r14.b
            if (r14 == 0) goto L_0x0077
            java.util.WeakHashMap r15 = defpackage.eaf.a
            int r14 = r14.getPaddingStart()
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            if (r5 == 0) goto L_0x0082
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            int r15 = r15.I()
            goto L_0x0091
        L_0x0082:
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            androidx.recyclerview.widget.RecyclerView r15 = r15.b
            if (r15 == 0) goto L_0x0090
            java.util.WeakHashMap r16 = defpackage.eaf.a
            int r15 = r15.getPaddingEnd()
            goto L_0x0091
        L_0x0090:
            r15 = 0
        L_0x0091:
            cj5 r9 = new cj5
            r9.<init>()
            r10 = r30
            r9.k = r10
            int r12 = r12 + r13
            r9.a = r12
            x6c r13 = r4.y
            int r13 = r13.b()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r16
            r17 = 0
            r18 = 0
        L_0x00ab:
            if (r10 >= r13) goto L_0x049f
            android.view.View r2 = r4.Z0(r10)
            if (r2 != 0) goto L_0x00d1
            r20 = 1
            int r2 = r13 + -1
            if (r10 != r2) goto L_0x00cc
            int r2 = r9.d
            r30 = r11
            int r11 = r9.e
            int r2 = r2 - r11
            r11 = r17
            if (r2 == 0) goto L_0x00c7
            r0.s(r8, r9, r10, r11)
        L_0x00c7:
            r17 = r3
            r32 = r14
            goto L_0x00f6
        L_0x00cc:
            r30 = r11
            r11 = r17
            goto L_0x00c7
        L_0x00d1:
            r30 = r11
            r11 = r17
            int r1 = r2.getVisibility()
            r17 = r3
            r3 = 8
            if (r1 != r3) goto L_0x010e
            int r1 = r9.e
            r2 = 1
            int r1 = r1 + r2
            r9.e = r1
            int r3 = r9.d
            int r3 = r3 + r2
            r9.d = r3
            r32 = r14
            int r14 = r13 + -1
            if (r10 != r14) goto L_0x00f6
            int r3 = r3 - r1
            if (r3 == 0) goto L_0x00f6
            r0.s(r8, r9, r10, r11)
        L_0x00f6:
            r2 = r31
            r24 = r5
            r22 = r6
            r21 = r7
            r5 = r8
            r8 = r11
            r20 = r13
            r1 = r19
            r3 = -1
            r7 = 1
            r6 = r29
            r11 = r30
            r19 = r12
            goto L_0x0488
        L_0x010e:
            r32 = r14
            boolean r1 = r2 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x014c
            r1 = r2
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            bj5 r3 = (defpackage.bj5) r3
            ej5 r3 = (defpackage.ej5) r3
            int r14 = r3.x0
            r20 = r13
            int r13 = r3.y0
            android.graphics.drawable.Drawable r1 = defpackage.m93.a(r1)
            if (r1 != 0) goto L_0x012e
            r21 = 0
            goto L_0x0132
        L_0x012e:
            int r21 = r1.getMinimumWidth()
        L_0x0132:
            if (r1 != 0) goto L_0x0138
            r1 = -1
            r22 = 0
            goto L_0x013f
        L_0x0138:
            int r1 = r1.getMinimumHeight()
            r22 = r1
            r1 = -1
        L_0x013f:
            if (r14 != r1) goto L_0x0143
            r14 = r21
        L_0x0143:
            r3.x0 = r14
            if (r13 != r1) goto L_0x0149
            r13 = r22
        L_0x0149:
            r3.y0 = r13
            goto L_0x014e
        L_0x014c:
            r20 = r13
        L_0x014e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            bj5 r1 = (defpackage.bj5) r1
            r3 = r1
            ej5 r3 = (defpackage.ej5) r3
            int r13 = r3.Z
            r14 = 4
            if (r13 != r14) goto L_0x0165
            java.util.ArrayList r13 = r9.j
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.add(r14)
        L_0x0165:
            if (r5 == 0) goto L_0x016a
            int r13 = r3.width
            goto L_0x016c
        L_0x016a:
            int r13 = r3.height
        L_0x016c:
            float r14 = r3.w0
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r21 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r21 == 0) goto L_0x0181
            r21 = r13
            r13 = 1073741824(0x40000000, float:2.0)
            if (r6 != r13) goto L_0x0183
            float r13 = (float) r7
            float r13 = r13 * r14
            int r13 = java.lang.Math.round(r13)
            goto L_0x0185
        L_0x0181:
            r21 = r13
        L_0x0183:
            r13 = r21
        L_0x0185:
            if (r5 == 0) goto L_0x01cb
            int r14 = r3.leftMargin
            int r14 = r14 + r12
            r21 = r7
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.rightMargin
            int r7 = r7 + r14
            int r14 = r4.n
            r22 = r6
            int r6 = r4.l
            r23 = r8
            boolean r8 = r4.e()
            int r6 = androidx.recyclerview.widget.a.x(r8, r14, r6, r7, r13)
            int r14 = r32 + r15
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.topMargin
            int r7 = r7 + r14
            r8 = r1
            ej5 r8 = (defpackage.ej5) r8
            int r8 = r8.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r11
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.height
            int r13 = r4.o
            int r14 = r4.m
            r24 = r5
            boolean r5 = r4.f()
            int r5 = androidx.recyclerview.widget.a.x(r5, r13, r14, r8, r7)
            r2.measure(r6, r5)
            r0.P(r2, r10, r6, r5)
            goto L_0x020e
        L_0x01cb:
            r24 = r5
            r22 = r6
            r21 = r7
            r23 = r8
            int r14 = r32 + r15
            int r5 = r3.leftMargin
            int r5 = r5 + r14
            r6 = r1
            ej5 r6 = (defpackage.ej5) r6
            int r6 = r6.rightMargin
            int r6 = r6 + r5
            int r6 = r6 + r11
            r5 = r1
            ej5 r5 = (defpackage.ej5) r5
            int r5 = r5.width
            int r7 = r4.n
            int r8 = r4.l
            boolean r14 = r4.e()
            int r5 = androidx.recyclerview.widget.a.x(r14, r7, r8, r6, r5)
            r6 = r1
            ej5 r6 = (defpackage.ej5) r6
            int r6 = r6.topMargin
            int r6 = r6 + r12
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.bottomMargin
            int r7 = r7 + r6
            int r6 = r4.o
            int r8 = r4.m
            boolean r14 = r4.f()
            int r6 = androidx.recyclerview.widget.a.x(r14, r6, r8, r7, r13)
            r2.measure(r5, r6)
            r0.P(r2, r10, r5, r6)
        L_0x020e:
            r4.k1(r2, r10)
            r0.v(r2, r10)
            int r5 = r2.getMeasuredState()
            r7 = r18
            int r18 = android.view.View.combineMeasuredStates(r7, r5)
            int r5 = r9.a
            if (r24 == 0) goto L_0x0227
            int r7 = r2.getMeasuredWidth()
            goto L_0x022b
        L_0x0227:
            int r7 = r2.getMeasuredHeight()
        L_0x022b:
            if (r24 == 0) goto L_0x0230
            int r8 = r3.leftMargin
            goto L_0x0232
        L_0x0230:
            int r8 = r3.topMargin
        L_0x0232:
            int r8 = r8 + r7
            if (r24 == 0) goto L_0x023b
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.rightMargin
            goto L_0x0240
        L_0x023b:
            r7 = r1
            ej5 r7 = (defpackage.ej5) r7
            int r7 = r7.bottomMargin
        L_0x0240:
            int r7 = r7 + r8
            int r8 = r23.size()
            int r13 = r4.q
            if (r13 != 0) goto L_0x024e
        L_0x0249:
            r5 = r23
            r6 = 1
            goto L_0x032e
        L_0x024e:
            boolean r13 = r3.B0
            if (r13 == 0) goto L_0x0255
            r7 = r21
            goto L_0x029b
        L_0x0255:
            if (r22 != 0) goto L_0x0258
            goto L_0x0249
        L_0x0258:
            int r13 = r4.s
            r14 = -1
            if (r13 == r14) goto L_0x0262
            r14 = 1
            int r8 = r8 + r14
            if (r13 > r8) goto L_0x0262
            goto L_0x0249
        L_0x0262:
            boolean r8 = r4.d1()
            if (r8 == 0) goto L_0x027e
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            n6c r8 = (defpackage.n6c) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.left
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            n6c r13 = (defpackage.n6c) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.right
        L_0x027c:
            int r8 = r8 + r13
            goto L_0x0293
        L_0x027e:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            n6c r8 = (defpackage.n6c) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.top
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            n6c r13 = (defpackage.n6c) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.bottom
            goto L_0x027c
        L_0x0293:
            if (r8 <= 0) goto L_0x0296
            int r7 = r7 + r8
        L_0x0296:
            int r5 = r5 + r7
            r7 = r21
            if (r7 >= r5) goto L_0x032a
        L_0x029b:
            int r5 = r9.d
            int r8 = r9.e
            int r5 = r5 - r8
            if (r5 <= 0) goto L_0x02b4
            if (r10 <= 0) goto L_0x02aa
            r5 = 1
            int r8 = r10 + -1
            r5 = r23
            goto L_0x02ad
        L_0x02aa:
            r5 = r23
            r8 = 0
        L_0x02ad:
            r0.s(r5, r9, r8, r11)
            int r8 = r9.c
            int r8 = r8 + r11
            goto L_0x02b7
        L_0x02b4:
            r5 = r23
            r8 = r11
        L_0x02b7:
            if (r24 == 0) goto L_0x02ec
            int r9 = r3.height
            r11 = -1
            if (r9 != r11) goto L_0x02e9
            r9 = r17
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            int r11 = r9.L()
            int r9 = r9.I()
            int r9 = r9 + r11
            int r11 = r3.topMargin
            int r9 = r9 + r11
            int r11 = r3.bottomMargin
            int r9 = r9 + r11
            int r9 = r9 + r8
            int r11 = r3.height
            int r13 = r4.o
            int r14 = r4.m
            r21 = r7
            boolean r7 = r4.f()
            int r7 = androidx.recyclerview.widget.a.x(r7, r13, r14, r9, r11)
            r2.measure(r6, r7)
            r0.v(r2, r10)
            goto L_0x031b
        L_0x02e9:
            r21 = r7
            goto L_0x031b
        L_0x02ec:
            r21 = r7
            int r7 = r3.width
            r9 = -1
            if (r7 != r9) goto L_0x031b
            r7 = r17
            androidx.recyclerview.widget.a r7 = (androidx.recyclerview.widget.a) r7
            int r9 = r7.J()
            int r7 = r7.K()
            int r7 = r7 + r9
            int r9 = r3.leftMargin
            int r7 = r7 + r9
            int r9 = r3.rightMargin
            int r7 = r7 + r9
            int r7 = r7 + r8
            int r9 = r3.width
            int r11 = r4.n
            int r13 = r4.l
            boolean r14 = r4.e()
            int r7 = androidx.recyclerview.widget.a.x(r14, r11, r13, r7, r9)
            r2.measure(r7, r6)
            r0.v(r2, r10)
        L_0x031b:
            cj5 r9 = new cj5
            r9.<init>()
            r6 = 1
            r9.d = r6
            r9.a = r12
            r9.k = r10
            r6 = r16
            goto L_0x0336
        L_0x032a:
            r21 = r7
            goto L_0x0249
        L_0x032e:
            int r7 = r9.d
            int r7 = r7 + r6
            r9.d = r7
            r8 = r11
            r6 = r19
        L_0x0336:
            boolean r7 = r9.m
            float r11 = r3.X
            r13 = 0
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x0341
            r14 = 1
            goto L_0x0342
        L_0x0341:
            r14 = 0
        L_0x0342:
            r7 = r7 | r14
            r9.m = r7
            boolean r7 = r9.n
            float r14 = r3.Y
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x034f
            r13 = 1
            goto L_0x0350
        L_0x034f:
            r13 = 0
        L_0x0350:
            r7 = r7 | r13
            r9.n = r7
            java.lang.Object r7 = r0.c
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x035f
            int r13 = r5.size()
            r7[r10] = r13
        L_0x035f:
            int r7 = r9.a
            if (r24 == 0) goto L_0x0368
            int r13 = r2.getMeasuredWidth()
            goto L_0x036c
        L_0x0368:
            int r13 = r2.getMeasuredHeight()
        L_0x036c:
            if (r24 == 0) goto L_0x0376
            r19 = r12
            r12 = r1
            ej5 r12 = (defpackage.ej5) r12
            int r12 = r12.leftMargin
            goto L_0x037d
        L_0x0376:
            r19 = r12
            r12 = r1
            ej5 r12 = (defpackage.ej5) r12
            int r12 = r12.topMargin
        L_0x037d:
            int r12 = r12 + r13
            if (r24 == 0) goto L_0x0386
            r13 = r1
            ej5 r13 = (defpackage.ej5) r13
            int r13 = r13.rightMargin
            goto L_0x038b
        L_0x0386:
            r13 = r1
            ej5 r13 = (defpackage.ej5) r13
            int r13 = r13.bottomMargin
        L_0x038b:
            int r13 = r13 + r12
            int r13 = r13 + r7
            r9.a = r13
            float r7 = r9.f
            float r7 = r7 + r11
            r9.f = r7
            float r7 = r9.g
            float r7 = r7 + r14
            r9.g = r7
            android.graphics.Rect r7 = com.google.android.flexbox.FlexboxLayoutManager.N
            r4.d(r7, r2)
            boolean r7 = r4.d1()
            if (r7 == 0) goto L_0x03c4
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            n6c r7 = (defpackage.n6c) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.left
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            n6c r11 = (defpackage.n6c) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.right
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
            goto L_0x03e3
        L_0x03c4:
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            n6c r7 = (defpackage.n6c) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.top
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            n6c r11 = (defpackage.n6c) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.bottom
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
        L_0x03e3:
            if (r24 == 0) goto L_0x03ea
            int r7 = r2.getMeasuredHeight()
            goto L_0x03ee
        L_0x03ea:
            int r7 = r2.getMeasuredWidth()
        L_0x03ee:
            if (r24 == 0) goto L_0x03f6
            r11 = r1
            ej5 r11 = (defpackage.ej5) r11
            int r11 = r11.topMargin
            goto L_0x03fb
        L_0x03f6:
            r11 = r1
            ej5 r11 = (defpackage.ej5) r11
            int r11 = r11.leftMargin
        L_0x03fb:
            int r11 = r11 + r7
            if (r24 == 0) goto L_0x0403
            ej5 r1 = (defpackage.ej5) r1
            int r1 = r1.bottomMargin
            goto L_0x0407
        L_0x0403:
            ej5 r1 = (defpackage.ej5) r1
            int r1 = r1.rightMargin
        L_0x0407:
            int r1 = r1 + r11
            int r7 = r4.Y0(r2)
            int r7 = r7 + r1
            int r1 = java.lang.Math.max(r6, r7)
            int r6 = r9.c
            int r6 = java.lang.Math.max(r6, r1)
            r9.c = r6
            if (r24 == 0) goto L_0x042f
            int r6 = r4.q
            r7 = 2
            if (r6 == r7) goto L_0x0431
            int r6 = r9.h
            int r2 = r2.getBaseline()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r6, r2)
            r9.h = r2
        L_0x042f:
            r2 = 1
            goto L_0x0446
        L_0x0431:
            int r6 = r9.h
            int r7 = r2.getMeasuredHeight()
            int r2 = r2.getBaseline()
            int r7 = r7 - r2
            int r2 = r3.bottomMargin
            int r7 = r7 + r2
            int r2 = java.lang.Math.max(r6, r7)
            r9.h = r2
            goto L_0x042f
        L_0x0446:
            int r13 = r20 + -1
            if (r10 != r13) goto L_0x0457
            int r2 = r9.d
            int r3 = r9.e
            int r2 = r2 - r3
            if (r2 == 0) goto L_0x0457
            r0.s(r5, r9, r10, r8)
            int r2 = r9.c
            int r8 = r8 + r2
        L_0x0457:
            r2 = r31
            r3 = -1
            if (r2 == r3) goto L_0x047e
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x047e
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object r6 = r5.get(r6)
            cj5 r6 = (defpackage.cj5) r6
            int r6 = r6.l
            if (r6 < r2) goto L_0x047e
            if (r10 < r2) goto L_0x047e
            if (r30 != 0) goto L_0x047e
            int r6 = r9.c
            int r6 = -r6
            r8 = r6
            r11 = 1
            r6 = r29
            goto L_0x0482
        L_0x047e:
            r6 = r29
            r11 = r30
        L_0x0482:
            if (r8 <= r6) goto L_0x0487
            if (r11 == 0) goto L_0x0487
            goto L_0x049f
        L_0x0487:
            r7 = 1
        L_0x0488:
            int r10 = r10 + r7
            r14 = r32
            r3 = r17
            r12 = r19
            r13 = r20
            r7 = r21
            r6 = r22
            r19 = r1
            r1 = r2
            r17 = r8
            r8 = r5
            r5 = r24
            goto L_0x00ab
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j54.t(ea6, int, int, int, int, int, java.util.List):void");
    }

    public int u() {
        return ((long[]) this.b).length;
    }

    public void v(View view, int i) {
        boolean z;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        ej5 ej5 = (ej5) ((bj5) view.getLayoutParams());
        int i2 = ej5.x0;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = ej5.z0)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = ej5.y0;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = ej5.A0;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            P(view, i, makeMeasureSpec, makeMeasureSpec2);
            ((FlexboxLayoutManager) ((aj5) this.a)).k1(view, i);
        }
    }

    public void w(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.o;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    public void x(int i, int i2, int i3) {
        int i4;
        int J;
        int K;
        aj5 aj5 = (aj5) this.a;
        int b2 = ((FlexboxLayoutManager) aj5).y.b();
        boolean[] zArr = (boolean[]) this.b;
        int i5 = 0;
        if (zArr == null) {
            this.b = new boolean[Math.max(b2, 10)];
        } else if (zArr.length < b2) {
            this.b = new boolean[Math.max(zArr.length * 2, b2)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < ((FlexboxLayoutManager) aj5).y.b()) {
            int i6 = ((FlexboxLayoutManager) aj5).p;
            int i7 = ((FlexboxLayoutManager) aj5).p;
            if (i7 == 0 || i7 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int a1 = ((FlexboxLayoutManager) aj5).a1();
                if (mode != 1073741824) {
                    size = Math.min(a1, size);
                }
                J = ((a) aj5).J();
                K = ((a) aj5).K();
            } else if (i7 == 2 || i7 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i4 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i4 = ((FlexboxLayoutManager) aj5).a1();
                }
                J = ((a) aj5).L();
                K = ((a) aj5).I();
            } else {
                throw new IllegalArgumentException(wn6.h(i6, "Invalid flex direction: "));
            }
            int i8 = K + J;
            int[] iArr = (int[]) this.c;
            if (iArr != null) {
                i5 = iArr[i3];
            }
            List list = ((FlexboxLayoutManager) aj5).v;
            int size2 = list.size();
            while (i5 < size2) {
                cj5 cj5 = (cj5) list.get(i5);
                int i9 = cj5.a;
                if (i9 < i4 && cj5.m) {
                    B(i, i2, cj5, i4, i8, false);
                } else if (i9 > i4 && cj5.n) {
                    L(i, i2, cj5, i4, i8, false);
                }
                i5++;
            }
        }
    }

    public void y(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf((int[]) this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void z(int i) {
        long[] jArr = (long[]) this.o;
        if (jArr == null) {
            this.o = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.o = Arrays.copyOf((long[]) this.o, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j54(t97 t97, t97 t972, t97 t973, int i) {
        this(t97, t972, (i & 4) != 0 ? null : t973, (Set) qw4.a);
    }

    public j54(use use, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = use;
        this.o = hashMap2;
        this.X = hashMap3;
        this.c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        use.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }
}
