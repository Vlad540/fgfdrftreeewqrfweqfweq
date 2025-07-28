package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.gms.common.api.ResolvableApiException;
import java.io.File;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: duf  reason: default package */
public final class duf implements yx4, om7, ms7, i36, oaa, bee {
    public static final /* synthetic */ int o = 0;
    public final Object a;
    public final Object b;
    public Object c;

    public duf(o88 o88, a aVar, FrameLayout frameLayout) {
        this.c = o88;
        this.a = aVar;
        this.b = frameLayout;
    }

    public void I(CharSequence charSequence) {
        oaa oaa = ((jea) this.c).a;
        if (oaa != null) {
            oaa.I(charSequence);
        }
    }

    public void T() {
        int i;
        int i2;
        lea lea = (lea) this.b;
        if (lea != null) {
            nea nea = lea.a;
            nea.J0 = false;
            int ordinal = nea.getForm().ordinal();
            boolean z = true;
            if (ordinal == 0) {
                wia actionsHorizontalPadding = nea.getActionsHorizontalPadding();
                i = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            } else if (ordinal == 1) {
                wia actionsHorizontalPadding2 = nea.getActionsHorizontalPadding();
                i = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            } else if (ordinal == 2) {
                wia actionsHorizontalPadding3 = nea.getActionsHorizontalPadding();
                i = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int ordinal2 = nea.getForm().ordinal();
            if (ordinal2 == 0) {
                wia actionsHorizontalPadding4 = nea.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            } else if (ordinal2 == 1) {
                wia actionsHorizontalPadding5 = nea.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            } else if (ordinal2 == 2) {
                wia actionsHorizontalPadding6 = nea.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            nea.setPadding(i, nea.getPaddingTop(), i2, nea.getPaddingBottom());
            View view = nea.G0;
            if (view instanceof raa) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginEnd(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                View view2 = nea.F0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            TextView textView = nea.y0;
            textView.setVisibility(0);
            textView.setWidth(textView.getMeasuredWidth());
            t97 t97 = nea.z0;
            if (t97.a()) {
                ddd ddd = (ddd) t97.getValue();
                if (ddd.getVisibility() != 0) {
                    z = false;
                }
                boolean z2 = nea.I0;
                if (z != z2) {
                    ddd.setVisibility(z2 ? 0 : 8);
                    k77 k77 = nea.L0[5];
                    ddd.a(((Boolean) nea.x0.b).booleanValue());
                    nea.l();
                }
            }
            t97 t972 = nea.A0;
            if (t972.a()) {
                ((mz9) t972.getValue()).setVisibility(0);
            }
            t97 t973 = nea.B0;
            if (t973.a()) {
                ((ImageView) t973.getValue()).setVisibility(0);
            }
            OneMeButton oneMeButton = nea.E0;
            if (oneMeButton != null) {
                oneMeButton.setVisibility(0);
            }
        }
        oaa oaa = ((jea) this.c).a;
        if (oaa != null) {
            oaa.T();
        }
    }

    public void a(Object obj) {
        Surface surface = (Surface) obj;
        ct0.C((ch7) this.a, (sn1) this.b);
    }

    public void b(String str, List list) {
        k77[] k77Arr = ksa.K0;
        ((ksa) this.a).r().h = null;
        boolean f = hhd.f(str, (String) this.b);
        yv1 yv1 = (yv1) this.c;
        if (f) {
            yv1.resumeWith(list);
            return;
        }
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause((Throwable) null);
        yv1.resumeWith(new kcc(cancellationException));
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [hhc, x10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [hhc, java.lang.Object, gmd] */
    /* JADX WARNING: type inference failed for: r6v15, types: [nod, hhc, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hhc d(int r7, byte[] r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x012d
            r0 = 2
            if (r7 != r0) goto L_0x0120
            ws8 r7 = lr8.a(r8)     // Catch:{ all -> 0x001a }
            int r0 = r7.v0()     // Catch:{ all -> 0x0029 }
            r1 = 0
            java.lang.Object r2 = r6.a
            gvf r2 = (defpackage.gvf) r2
            switch(r0) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00a9;
                case 3: goto L_0x008c;
                case 4: goto L_0x0066;
                case 5: goto L_0x005a;
                case 6: goto L_0x002c;
                case 7: goto L_0x0015;
                case 8: goto L_0x001d;
                default: goto L_0x0015;
            }
        L_0x0015:
            r7.close()     // Catch:{ all -> 0x001a }
            r6 = 0
            return r6
        L_0x001a:
            r6 = move-exception
            goto L_0x010b
        L_0x001d:
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x0029 }
            j1c r6 = (defpackage.j1c) r6     // Catch:{ all -> 0x0029 }
            oef r6 = r6.k(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0029:
            r6 = move-exception
            goto L_0x0102
        L_0x002c:
            int r6 = r7.x0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x0035:
            if (r1 >= r6) goto L_0x0051
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            ge1 r3 = r2.r(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.v0()     // Catch:{ all -> 0x0029 }
            float r4 = (float) r4     // Catch:{ all -> 0x0029 }
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0029 }
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0051:
            zh9 r6 = new zh9     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x005a:
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0029 }
            n54 r6 = (n54) r6     // Catch:{ all -> 0x0029 }
            y7f r6 = r6.a(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0066:
            int r6 = r7.s0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x006f:
            if (r1 >= r6) goto L_0x0081
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            ge1 r3 = r2.r(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x007e
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x0081:
            nod r6 = new nod     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x008c:
            int r6 = r7.v0()     // Catch:{ all -> 0x0029 }
            ge1 r6 = r2.r(r6)     // Catch:{ all -> 0x0029 }
            gmd r0 = new gmd     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x00a1
            r0.a = r6     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r0
        L_0x00a1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "Illegal 'speaker' value: null"
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            throw r6     // Catch:{ all -> 0x0029 }
        L_0x00a9:
            int r6 = r7.s0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00b2:
            if (r1 >= r6) goto L_0x00c4
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            ge1 r3 = r2.r(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00c1
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x00c1:
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c4:
            x10 r6 = new x10     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x00cf:
            int r6 = r7.x0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00d8:
            if (r1 >= r6) goto L_0x00f2
            java.lang.String r3 = r7.z0()     // Catch:{ all -> 0x0029 }
            xm1 r3 = x87.w0(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.v0()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00ef
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0029 }
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d8
        L_0x00f2:
            java.lang.Object r6 = r2.b     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch:{ all -> 0x0029 }
            r6.putAll(r0)     // Catch:{ all -> 0x0029 }
            bp6 r6 = new bp6     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0102:
            r7.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ all -> 0x001a }
        L_0x010a:
            throw r6     // Catch:{ all -> 0x001a }
        L_0x010b:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r7 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = tf6.a(r8)
            java.lang.String r1 = "Unable to decode notification body: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8, r6)
            r7.<init>(r0)
            throw r7
        L_0x0120:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Only binary format is supported"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x012d:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Illegal 'format' value: null"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duf.d(int, byte[]):hhc");
    }

    public void e(Throwable th) {
        boolean z = th instanceof CancellationException;
        sn1 sn1 = (sn1) this.b;
        if (z) {
            e07.p((String) null, sn1.d(new RuntimeException(wn6.l(new StringBuilder(), (String) this.c, " cancelled."), th)));
        } else {
            sn1.b((Object) null);
        }
    }

    public void f() {
        lea lea;
        if (((raa) this.a).A0 && (lea = (lea) this.b) != null) {
            lea.a();
        }
        oaa oaa = ((jea) this.c).a;
        if (oaa != null) {
            oaa.f();
        }
    }

    public ByteBuffer h() {
        AtomicLong atomicLong = (AtomicLong) this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < ((long) byteBuffer.capacity())) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet((long) (-byteBuffer.remaining()));
        }
        return byteBuffer;
    }

    public wa6 i() {
        if (((wa6) this.c) == null) {
            this.c = (wa6) ((k93) ((FrgBase) this.b).t1.b).getAccessor().c(wa6.class);
        }
        return (wa6) this.c;
    }

    public void j() {
        udd.p("duf", "onSuccessCheckSettings", new Object[0]);
    }

    public void k(Exception exc) {
        b c0;
        udd.s("duf", "onFailureCheckSettings", exc);
        i().getClass();
        if ((exc instanceof ResolvableApiException) && (c0 = ((FrgBase) this.b).c0()) != null) {
            try {
                i().getClass();
                if (exc instanceof ResolvableApiException) {
                    PendingIntent pendingIntent = ((ResolvableApiException) exc).a.c;
                    if (pendingIntent != null) {
                        a24.o(pendingIntent);
                        c0.startIntentSenderForResult(pendingIntent.getIntentSender(), 301, (Intent) null, 0, 0, 0);
                    }
                }
            } catch (IntentSender.SendIntentException unused) {
                udd.s("duf", "Can't resolve check settings error", exc);
                ((g15) this.a).c(new Exception("Can't resolve check settings error"), true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zx4 l(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Object r0 = r2.get(r0)
            zx4 r0 = (defpackage.zx4) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.a
            yx4 r3 = (defpackage.yx4) r3
            boolean r4 = r3.o(r1)
            if (r4 == 0) goto L_0x013e
            zx4 r3 = r3.r(r1)
            if (r3 != 0) goto L_0x0030
        L_0x002d:
            r5 = 0
            goto L_0x0136
        L_0x0030:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r3.d()
            r4.<init>(r6)
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0041:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0052
            java.lang.Object r7 = r6.next()
            g90 r7 = (defpackage.g90) r7
            int r8 = r7.j
            if (r8 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 != 0) goto L_0x0058
            r5 = 0
            goto L_0x00c6
        L_0x0058:
            int r6 = r7.j
            r15 = 1
            if (r15 == r6) goto L_0x0068
            r6 = 5
            java.lang.String r8 = "video/hevc"
            r9 = 2
        L_0x0061:
            r10 = r8
            r19 = r9
            r9 = r6
            r6 = r19
            goto L_0x006f
        L_0x0068:
            int r6 = r7.a
            java.lang.String r8 = r7.b
            int r9 = r7.g
            goto L_0x0061
        L_0x006f:
            r14 = 10
            int r8 = r7.c
            int r11 = r7.h
            if (r14 != r11) goto L_0x007b
            r16 = r6
            r11 = r8
            goto L_0x00ac
        L_0x007b:
            android.util.Rational r12 = new android.util.Rational
            r12.<init>(r14, r11)
            r16 = r6
            double r5 = (double) r8
            double r12 = r12.doubleValue()
            double r12 = r12 * r5
            int r5 = (int) r12
            java.lang.String r6 = "BackupHdrProfileEncoderProfilesProvider"
            r12 = 3
            boolean r6 = defpackage.hwf.l(r12, r6)
            if (r6 == 0) goto L_0x00ab
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r8, r11, r12}
            java.lang.String r8 = "Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d"
            java.lang.String.format(r8, r6)
        L_0x00ab:
            r11 = r5
        L_0x00ac:
            g90 r5 = new g90
            int r6 = r7.f
            int r13 = r7.i
            int r12 = r7.d
            int r7 = r7.e
            r8 = r5
            r17 = r13
            r13 = r7
            r7 = r14
            r14 = r6
            r6 = r15
            r15 = r16
            r16 = r7
            r18 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00c6:
            if (r5 != 0) goto L_0x00ca
        L_0x00c8:
            r5 = 0
            goto L_0x0119
        L_0x00ca:
            ib0 r6 = defpackage.t2f.d(r5)
            java.lang.Object r0 = r0.b
            t26 r0 = (defpackage.t26) r0
            java.lang.Object r0 = r0.apply(r6)
            q3f r0 = (defpackage.q3f) r0
            if (r0 == 0) goto L_0x00c8
            int r7 = r5.e
            int r8 = r5.f
            boolean r7 = r0.Q0(r7, r8)
            if (r7 != 0) goto L_0x00e5
            goto L_0x00c8
        L_0x00e5:
            android.util.Range r0 = r0.b1()
            int r6 = r6.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Comparable r0 = r0.clamp(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            if (r10 != r6) goto L_0x00fc
            goto L_0x0119
        L_0x00fc:
            g90 r0 = new g90
            int r14 = r5.g
            int r15 = r5.h
            int r8 = r5.a
            java.lang.String r9 = r5.b
            int r11 = r5.d
            int r12 = r5.e
            int r13 = r5.f
            int r6 = r5.i
            int r5 = r5.j
            r7 = r0
            r16 = r6
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r0
        L_0x0119:
            if (r5 == 0) goto L_0x011e
            r4.add(r5)
        L_0x011e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0126
            goto L_0x002d
        L_0x0126:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            f90 r5 = defpackage.f90.e(r0, r5, r3, r4)
        L_0x0136:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.put(r0, r5)
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duf.l(int):zx4");
    }

    public ArrayList m(String str) {
        pec a2 = pec.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            return arrayList;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public void n() {
        lea lea;
        if (((raa) this.a).A0 && (lea = (lea) this.b) != null) {
            lea.a();
        }
        oaa oaa = ((jea) this.c).a;
        if (oaa != null) {
            oaa.n();
        }
    }

    public boolean o(int i) {
        return ((yx4) this.a).o(i) && l(i) != null;
    }

    public void p() {
        oaa oaa = ((jea) this.c).a;
        if (oaa != null) {
            oaa.p();
        }
    }

    public boolean q() {
        return ((ByteBuffer) this.b).hasRemaining() || ((AtomicLong) this.c).get() > 0;
    }

    public zx4 r(int i) {
        return l(i);
    }

    public void s(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cuf cuf = new cuf((String) it.next(), str);
            aec aec = (aec) this.a;
            aec.b();
            aec.c();
            try {
                ((qtf) this.b).C(cuf);
                aec.r();
            } finally {
                aec.l();
            }
        }
    }

    public ThreadFactory t(String str, Integer num) {
        return (ThreadFactory) ((ConcurrentHashMap) this.c).computeIfAbsent(str, new di(13, new to1(str, this, num, 10)));
    }

    public void u(int i, String[] strArr, int[] iArr) {
        Context e0;
        Context e02;
        FrgBase frgBase = (FrgBase) this.b;
        if (i == 169) {
            if (urd.S((FrgBase) this.b, strArr, iArr, urd.e, cic.Y1, cic.Z1) && (e02 = frgBase.e0()) != null) {
                i().getClass();
                wa6.a(e02, this);
            }
        } else if (i == 175) {
            if (urd.S((FrgBase) this.b, strArr, iArr, urd.f, cic.R1, cic.Z1) && (e0 = frgBase.e0()) != null) {
                i().getClass();
                wa6.a(e0, this);
            }
        }
    }

    public void v() {
        FrgBase frgBase = (FrgBase) this.b;
        Context e0 = frgBase.e0();
        String[] strArr = urd.e;
        if (urd.j(e0, strArr)) {
            Context e02 = frgBase.e0();
            if (e02 != null) {
                i().getClass();
                wa6.a(e02, this);
                return;
            }
            return;
        }
        FrgDlgPermissions o1 = FrgDlgPermissions.o1(strArr, cic.c2, cic.a2, cic.b2, false);
        o1.c1(169, frgBase);
        o1.l1(frgBase.g0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
    }

    public /* synthetic */ duf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public duf(gvf gvf, xwb xwb) {
        this.a = gvf;
        this.b = new j1c(gvf, 13, xwb);
        this.c = new n54(xwb);
    }

    public duf(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, v4a v4a) {
        this.a = uncaughtExceptionHandler;
        this.b = v4a;
        this.c = new ConcurrentHashMap();
    }

    public duf(List list, fd5 fd5, gd5 gd5) {
        this.a = list;
        this.b = fd5;
        this.c = gd5;
        System.currentTimeMillis();
    }

    public duf(aec aec) {
        this.a = aec;
        this.b = new qtf(aec, 2);
        this.c = new rtf(aec, 12);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [otf, java.lang.Object] */
    public duf(zne zne, v2b v2b) {
        this.a = zne;
        this.b = zne.i;
        ? obj = new Object();
        obj.a = "CRASH_REPORT";
        obj.b = v2b;
        this.c = new qe4((otf) obj);
    }

    public duf(ydc ydc) {
        ArrayList arrayList = (ArrayList) ydc.b;
        this.a = arrayList != null ? new ArrayList(arrayList) : null;
        o3e o3e = (o3e) ydc.c;
        this.c = o3e == null ? new uz3(3, Boolean.FALSE) : o3e;
        this.b = (kv2) ydc.o;
    }

    public duf(h50 h50) {
        this.a = h50;
        ByteBuffer order = ByteBuffer.allocateDirect(h50.d * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY).order(ByteOrder.nativeOrder());
        this.b = order;
        order.flip();
        this.c = new AtomicLong();
    }

    public duf(g15 g15, FrgBase frgBase) {
        this.a = g15;
        this.b = frgBase;
    }

    public duf(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new m30(this);
        this.a = new qm(executor, 1);
    }

    public duf(String str) {
        this.a = str;
        this.b = null;
        this.c = null;
    }

    public duf(it4 it4) {
        sr1 sr1 = r3f.o;
        this.c = new HashMap();
        this.a = it4;
        this.b = sr1;
    }

    public duf(File file) {
        this.a = null;
        this.b = file;
        this.c = null;
    }

    public duf(Boolean bool) {
        this.a = null;
        this.b = null;
        this.c = bool;
    }
}
