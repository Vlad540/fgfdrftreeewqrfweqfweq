package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: k4c  reason: default package */
public final class k4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k4c k4c = new k4c(continuation, this.Y);
        k4c.X = obj;
        return k4c;
    }

    public final Object o(Object obj) {
        AnimatorSet animatorSet;
        wia wia;
        wx3.H(obj);
        MotionEvent motionEvent = (MotionEvent) this.X;
        k77[] k77Arr = RecordControlsWidget.m1;
        RecordControlsWidget recordControlsWidget = this.Y;
        p3c p3c = (p3c) recordControlsWidget.L0().B0.a.getValue();
        float f = 0.0f;
        if (recordControlsWidget.t0().getX() != 0.0f && !(p3c instanceof o3c) && (((animatorSet = recordControlsWidget.h1) == null || !animatorSet.isRunning()) && (wia = recordControlsWidget.Z0) != null)) {
            Float f2 = (Float) wia.a;
            Float f3 = (Float) wia.b;
            if (!(motionEvent.getAction() != 2 || f2 == null || f3 == null)) {
                float rawX = motionEvent.getRawX() - ((float) (recordControlsWidget.t0().getWidth() / 2));
                float y = motionEvent.getY() - ((float) (recordControlsWidget.t0().getWidth() / 2));
                double degrees = Math.toDegrees((double) ((float) Math.atan2((double) (-(y - f3.floatValue())), (double) (rawX - f2.floatValue()))));
                if (degrees < 0.0d) {
                    degrees += (double) 360;
                }
                int W = a24.W(Math.ceil(degrees));
                fz6 fz6 = RecordControlsWidget.n1;
                if (fz6.a <= W && W <= fz6.b) {
                    recordControlsWidget.b1 = 0.0f;
                    if (gwf.i((y - f3.floatValue()) / ((f3.floatValue() - ((float) a24.X(((float) 40) * dh4.c().getDisplayMetrics().density))) - f3.floatValue()), 0.0f, 1.0f) * 100.0f >= 100.0f) {
                        grd grd = recordControlsWidget.L0().A0;
                        p3c p3c2 = (p3c) grd.getValue();
                        if (p3c2 instanceof n3c) {
                            grd.m((Object) null, new n3c(((n3c) p3c2).a, true));
                        }
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            lp.K(view, ie6.CONFIRM);
                        }
                    } else {
                        if (f3.floatValue() - y > ((float) a24.X(((float) 1) * dh4.c().getDisplayMetrics().density))) {
                            AnimatorSet animatorSet2 = recordControlsWidget.j1;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet3 = recordControlsWidget.j1;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                        }
                        fnd fnd = recordControlsWidget.d1;
                        if (fnd != null) {
                            fnd.b();
                        }
                        View B0 = recordControlsWidget.B0();
                        wia wia2 = recordControlsWidget.a1;
                        B0.setTranslationX(wia2 != null ? ((Number) wia2.a).floatValue() : 0.0f);
                        View B02 = recordControlsWidget.B0();
                        wia wia3 = recordControlsWidget.a1;
                        if (wia3 != null) {
                            f = ((Number) wia3.b).floatValue();
                        }
                        B02.setTranslationY(recordControlsWidget.t0().getTranslationY() + f);
                        recordControlsWidget.t0().setX(f2.floatValue());
                        recordControlsWidget.t0().setY(y);
                    }
                } else {
                    fz6 fz62 = RecordControlsWidget.o1;
                    if (fz62.a <= W && W <= fz62.b) {
                        wia wia4 = recordControlsWidget.Z0;
                        float floatValue = wia4 != null ? ((Number) wia4.a).floatValue() : 0.0f;
                        float f4 = (float) 40;
                        float i = gwf.i((rawX - (floatValue - ((float) a24.X(dh4.c().getDisplayMetrics().density * f4)))) / ((floatValue - ((float) a24.X(((float) 90) * dh4.c().getDisplayMetrics().density))) - floatValue), 0.0f, 1.0f) * 100.0f;
                        recordControlsWidget.b1 = i;
                        if (i >= 100.0f) {
                            y3c L0 = recordControlsWidget.L0();
                            L0.B();
                            L0.A0.m((Object) null, new o3c(1, false, true));
                        } else {
                            if (floatValue - rawX > ((float) a24.X(((float) 1) * dh4.c().getDisplayMetrics().density))) {
                                AnimatorSet animatorSet4 = recordControlsWidget.i1;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = recordControlsWidget.j1;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                }
                            } else {
                                AnimatorSet animatorSet6 = recordControlsWidget.i1;
                                if (animatorSet6 != null) {
                                    animatorSet6.start();
                                }
                                AnimatorSet animatorSet7 = recordControlsWidget.j1;
                                if (animatorSet7 != null) {
                                    animatorSet7.start();
                                }
                            }
                            float f5 = (float) 84;
                            float p = (((recordControlsWidget.b1 / 100.0f) * ((float) me4.p(f5, dh4.c().getDisplayMetrics().density, a24.X(((float) 36) * dh4.c().getDisplayMetrics().density)))) + ((float) a24.X(dh4.c().getDisplayMetrics().density * f5))) / ((float) a24.X(f5 * dh4.c().getDisplayMetrics().density));
                            recordControlsWidget.t0().setScaleX(p);
                            recordControlsWidget.t0().setScaleY(p);
                            fnd fnd2 = recordControlsWidget.d1;
                            if (fnd2 != null) {
                                fnd2.a(motionEvent.getRawX() + ((float) (-recordControlsWidget.I0().getWidth())) + ((float) (a24.X(dh4.c().getDisplayMetrics().density * f4) / 2)));
                            }
                            View B03 = recordControlsWidget.B0();
                            wia wia5 = recordControlsWidget.a1;
                            B03.setTranslationY(wia5 != null ? ((Number) wia5.b).floatValue() : 0.0f);
                            float X2 = floatValue - ((float) a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
                            float i2 = gwf.i((rawX - X2) / ((floatValue - ((float) a24.X(f4 * dh4.c().getDisplayMetrics().density))) - X2), 0.0f, 1.0f);
                            float X3 = ((float) a24.X(((float) -20) * dh4.c().getDisplayMetrics().density)) * i2;
                            recordControlsWidget.v0().setAlpha(1.0f - i2);
                            recordControlsWidget.v0().setTranslationX(X3);
                            recordControlsWidget.t0().setX(rawX);
                            recordControlsWidget.t0().setY(f3.floatValue());
                        }
                    }
                }
            }
        }
        return jue.a;
    }
}
