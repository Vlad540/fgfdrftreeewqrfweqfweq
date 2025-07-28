package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: u51  reason: default package */
public final class u51 implements q6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(boolean z) {
    }

    private final void d(MotionEvent motionEvent) {
    }

    public final void a(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return;
            default:
                o27 o27 = (o27) this.b;
                ((GestureDetector) o27.M0.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = o27.I0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (o27.A0 != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(o27.A0);
                    if (findPointerIndex >= 0) {
                        o27.k(actionMasked, findPointerIndex, motionEvent);
                    }
                    b7c b7c = o27.c;
                    if (b7c != null) {
                        int i = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    VelocityTracker velocityTracker2 = o27.I0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.clear();
                                    }
                                } else if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == o27.A0) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        o27.A0 = motionEvent.getPointerId(i);
                                        o27.u(o27.D0, actionIndex, motionEvent);
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            } else if (findPointerIndex >= 0) {
                                o27.u(o27.D0, findPointerIndex, motionEvent);
                                o27.q(b7c);
                                RecyclerView recyclerView = o27.G0;
                                vp6 vp6 = o27.H0;
                                recyclerView.removeCallbacks(vp6);
                                vp6.run();
                                o27.G0.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        o27.s((b7c) null, 0);
                        o27.A0 = -1;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        switch (this.a) {
            case 0:
                if (recyclerView.H(motionEvent.getX(), motionEvent.getY()) != null) {
                    return false;
                }
                ((w51) this.b).R0.onTouchEvent(motionEvent);
                return false;
            default:
                o27 o27 = (o27) this.b;
                ((GestureDetector) o27.M0.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                k27 k27 = null;
                if (actionMasked == 0) {
                    o27.A0 = motionEvent.getPointerId(0);
                    o27.o = motionEvent.getX();
                    o27.X = motionEvent.getY();
                    VelocityTracker velocityTracker = o27.I0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    o27.I0 = VelocityTracker.obtain();
                    if (o27.c == null) {
                        ArrayList arrayList = o27.E0;
                        if (!arrayList.isEmpty()) {
                            View n = o27.n(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    k27 k272 = (k27) arrayList.get(size);
                                    if (k272.e.a == n) {
                                        k27 = k272;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (k27 != null) {
                            o27.o -= k27.i;
                            o27.X -= k27.j;
                            b7c b7c = k27.e;
                            o27.m(b7c, true);
                            if (o27.a.remove(b7c.a)) {
                                o27.B0.a(o27.G0, b7c);
                            }
                            o27.s(b7c, k27.f);
                            o27.u(o27.D0, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    o27.A0 = -1;
                    o27.s((b7c) null, 0);
                } else {
                    int i = o27.A0;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        o27.k(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = o27.I0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return o27.c != null;
        }
    }

    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (z) {
                    ((o27) this.b).s((b7c) null, 0);
                    return;
                }
                return;
        }
    }
}
