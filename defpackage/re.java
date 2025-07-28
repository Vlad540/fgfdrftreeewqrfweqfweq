package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chats.list.ChatsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import ru.ok.messages.messages.widgets.Chronometer;

/* renamed from: re  reason: default package */
public final class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ re(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int decrementAndGet;
        boolean isEmpty;
        ArrayList arrayList;
        nma nma;
        switch (this.a) {
            case 0:
                se seVar = (se) this.b;
                seVar.unscheduleSelf(this);
                seVar.invalidateSelf();
                return;
            case 1:
                synchronized (((wf) this.b)) {
                    wf wfVar = (wf) this.b;
                    wfVar.a = false;
                    if (((b69) wfVar.o).now() - wfVar.b > 2000) {
                        lm0 lm0 = (lm0) ((wf) this.b).Y;
                        if (lm0 != null) {
                            if (lm0.X) {
                                sm0 sm0 = lm0.Y;
                                if (sm0 != null) {
                                    sm0.n();
                                }
                            } else {
                                lm0.clear();
                            }
                        }
                    } else {
                        ((wf) this.b).b();
                    }
                }
                return;
            case 2:
                ((yv1) this.b).resumeWith(jue.a);
                return;
            case 3:
                zg7 zg7 = (zg7) this.b;
                if (zg7.D0) {
                    boolean z = zg7.B0;
                    h80 h80 = zg7.a;
                    if (z) {
                        zg7.B0 = false;
                        h80.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        h80.e = currentAnimationTimeMillis;
                        h80.g = -1;
                        h80.f = currentAnimationTimeMillis;
                        h80.h = 0.5f;
                    }
                    if ((h80.g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= h80.g + ((long) h80.i)) && zg7.e()) {
                        boolean z2 = zg7.C0;
                        View view = zg7.c;
                        if (z2) {
                            zg7.C0 = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            view.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (h80.f != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float a2 = h80.a(currentAnimationTimeMillis2);
                            h80.f = currentAnimationTimeMillis2;
                            zg7.F0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - h80.f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2)) * h80.d));
                            WeakHashMap weakHashMap = eaf.a;
                            view.postOnAnimation(this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    zg7.D0 = false;
                    return;
                }
                return;
            case 4:
                int i = z0b.A0;
                ((z0b) this.b).setHalfScreen((i26) null);
                return;
            case 5:
                for (Thread thread : rn0.x.keySet()) {
                    if (!thread.isAlive()) {
                        rn0.x.remove(thread);
                    }
                }
                if (!rn0.x.isEmpty()) {
                    je.e(((rn0) this.b).p, 5000);
                    return;
                } else {
                    rn0.y = false;
                    return;
                }
            case 6:
                bq0 bq0 = (bq0) this.b;
                bq0.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bq0.e;
                iaf iaf = bottomSheetBehavior.M;
                if (iaf != null && iaf.f()) {
                    bq0.b(bq0.b);
                    return;
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.L(bq0.b);
                    return;
                } else {
                    return;
                }
            case 7:
                tc1 tc1 = (tc1) this.b;
                Iterator it = tc1.i.iterator();
                while (it.hasNext()) {
                    ((sc1) it.next()).l.a(tc1.a);
                }
                rc1 rc1 = tc1.e;
                rc1.getClass();
                try {
                    rc1.k.postDelayed(this, 5000);
                    return;
                } catch (IllegalStateException e) {
                    rc1.a.reportException(rc1.j, "OpenGL tread died, is it fine?", e);
                    return;
                }
            case 8:
                p32 p32 = (p32) this.b;
                p32.S0 = false;
                p32.requestLayout();
                return;
            case 9:
                ((a9a) this.b).setAppearance(p8a.a);
                return;
            case 10:
                k77[] k77Arr = ChatsListWidget.O0;
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                if (!((hq2) chatsListWidget.o0().J0.getValue()).b && ((hq2) chatsListWidget.o0().K0.a.getValue()).a.isEmpty() && ((List) chatsListWidget.o0().N0.a.getValue()).isEmpty()) {
                    chatsListWidget.N0.b(Collections.singletonList(new pma(0)));
                    return;
                }
                return;
            case 11:
                Chronometer chronometer = (Chronometer) this.b;
                if (chronometer.B0) {
                    chronometer.k(SystemClock.elapsedRealtime());
                    chronometer.postDelayed(chronometer.K0, 1000);
                    return;
                }
                return;
            case 12:
                Class<la4> cls = la4.class;
                la4 la4 = (la4) this.b;
                try {
                    Runnable runnable = (Runnable) la4.o.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i2 = la4.w0;
                        m75.d(cls, la4.a, "%s: Worker has nothing to run");
                    }
                    if (isEmpty) {
                        int i3 = la4.w0;
                        m75.e(cls, "%s: worker finished; %d workers left", la4.a, Integer.valueOf(decrementAndGet));
                        return;
                    }
                    return;
                } finally {
                    decrementAndGet = la4.Y.decrementAndGet();
                    if (!la4.o.isEmpty()) {
                        la4.b();
                    } else {
                        int i4 = la4.w0;
                        m75.e(cls, "%s: worker finished; %d workers left", la4.a, Integer.valueOf(decrementAndGet));
                    }
                }
            case 13:
                ((s16) this.b).invoke();
                return;
            case 14:
                synchronized (((bd4) this.b).b) {
                    bd4 bd4 = (bd4) this.b;
                    arrayList = (ArrayList) bd4.o;
                    bd4.X = arrayList;
                    bd4.o = (ArrayList) bd4.X;
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((k0) ((ad4) ((ArrayList) ((bd4) this.b).X).get(i5))).n();
                }
                ((ArrayList) ((bd4) this.b).X).clear();
                return;
            case 15:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                dialogFragment.s1.onDismiss(dialogFragment.A1);
                return;
            case 16:
                ji4 ji4 = (ji4) this.b;
                if (!ji4.a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int size2 = ji4.a.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        gi4 gi4 = (gi4) ji4.a.get(i6);
                        if (gi4.c < elapsedRealtime - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            gi4.a.getLooper().quit();
                            ji4.a.remove(i6);
                            ji4.e--;
                            i6--;
                            size2--;
                        }
                        i6++;
                    }
                }
                if (!ji4.a.isEmpty() || !ji4.c.isEmpty()) {
                    je.e(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    ji4.h = true;
                    return;
                }
                ji4.h = false;
                return;
            case 17:
                ki4 ki4 = (ki4) this.b;
                if (!ki4.a.isEmpty()) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    int i7 = 0;
                    while (i7 < ki4.a.size()) {
                        gi4 gi42 = (gi4) ki4.a.get(i7);
                        if (gi42.c < elapsedRealtime2 - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            gi42.a.getLooper().quit();
                            ki4.a.remove(i7);
                            ki4.e--;
                            i7--;
                        }
                        i7++;
                    }
                }
                if (!ki4.a.isEmpty() || !ki4.c.isEmpty()) {
                    ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).schedule(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                    ki4.h = true;
                    return;
                }
                ki4.h = false;
                return;
            case 18:
                yo4 yo4 = (yo4) this.b;
                yo4.D0 = null;
                yo4.drawableStateChanged();
                return;
            case 19:
                ((AtomicBoolean) ((sy4) this.b).b).set(true);
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                s85 s85 = (s85) this.b;
                int i8 = s85.P0;
                ValueAnimator valueAnimator = s85.O0;
                if (i8 == 1) {
                    valueAnimator.cancel();
                } else if (i8 != 2) {
                    return;
                }
                s85.P0 = 3;
                valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            case 21:
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.b;
                Context e0 = fingerprintDialogFragment.e0();
                if (e0 != null) {
                    fingerprintDialogFragment.H1.h(1);
                    fingerprintDialogFragment.H1.g(e0.getString(gtb.fingerprint_dialog_touch_sensor));
                    return;
                }
                return;
            case 22:
                k77[] k77Arr2 = FoldersListScreen.Z;
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.b;
                foldersListScreen.getClass();
                ((RecyclerView) foldersListScreen.Y.T0(foldersListScreen, FoldersListScreen.Z[0])).Y();
                return;
            case 23:
                xr7 xr7 = (xr7) ((a30) this.b).b;
                oma oma = oma.Y;
                jc9 jc9 = xr7.e;
                nma nma2 = (nma) jc9.f(oma);
                if (nma2 != null && nma2.e == -1 && (nma = (nma) jc9.f(oma)) != null) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    nma.e = elapsedRealtime3 - nma.b;
                    nma nma3 = (nma) jc9.f(oma.Z);
                    if (nma3 == null || nma3.e != -1) {
                        xr7.f(elapsedRealtime3);
                        return;
                    }
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                a aVar = (a) this.b;
                if (aVar.b1 != null) {
                    aVar.b0().getClass();
                    return;
                }
                return;
            case 25:
                ((c) this.b).A(true);
                return;
            case 26:
                o88 o88 = (o88) this.b;
                o88.z0 = false;
                o88.E();
                return;
            case 27:
                ((ch7) this.b).cancel(true);
                return;
            case 28:
                b46 b46 = (b46) this.b;
                GLES20.glDeleteTextures(1, new int[]{b46.c}, 0);
                b46.c = -1;
                return;
            default:
                jj7 jj7 = (jj7) this.b;
                if (((ud6) jj7.c).a.getAndSet((Object) null) != null) {
                    ((Handler) jj7.a).removeCallbacks((ud6) jj7.c);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ re(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
