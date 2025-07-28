package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;

/* renamed from: uw8  reason: default package */
public final class uw8 extends jgd implements yw8 {
    public final qn8 X;
    public final u16 Y;
    public final hg6 Z;
    public final lv1 w0;
    public final k26 x0;
    public final xw6 y0;
    public final s16 z0;

    public uw8(ExecutorService executorService, k09 k09, h87 h87, ig6 ig6, lv1 lv1, rp0 rp0, ss8 ss8, a09 a09) {
        super(executorService);
        this.X = k09;
        this.Y = h87;
        this.Z = ig6;
        this.w0 = lv1;
        this.x0 = rp0;
        this.y0 = ss8;
        this.z0 = a09;
    }

    /* renamed from: I */
    public final void y(chd chd) {
        chd.D();
        gg6 gg6 = chd instanceof gg6 ? (gg6) chd : null;
        if (gg6 != null) {
            ig6 ig6 = (ig6) this.Z;
            ig6.getClass();
            ((ao8) gg6).J();
            ig6.b.remove(gg6);
        }
    }

    public final int J(long j) {
        int i;
        List b = b();
        int size = b.size();
        int i2 = 0;
        p23.E(b.size(), 0, size);
        int i3 = size - 1;
        while (true) {
            if (i2 > i3) {
                i = -(i2 + 1);
                break;
            }
            i = (i2 + i3) >>> 1;
            int intValue = Integer.valueOf(hhd.p(((MessageModel) b.get(i)).c, j)).intValue();
            if (intValue >= 0) {
                if (intValue <= 0) {
                    break;
                }
                i3 = i - 1;
            } else {
                i2 = i + 1;
            }
        }
        if (i < 0) {
            i = Math.abs(i) - 1;
        }
        az6 az6 = (az6) o23.Y(i, L());
        return az6 != null ? (int) (az6.a & 4294967295L) : this.o.f.size();
    }

    public final MessageModel K(int i) {
        pg7 G = G(i);
        if (G instanceof MessageModel) {
            return (MessageModel) G;
        }
        return null;
    }

    public final List L() {
        return myc.U(new ij4(myc.L(new es(3, new es(2, this.o.f)), new xz6(21)), 4, new vg0(17)));
    }

    public final List b() {
        List<az6> L = L();
        ArrayList arrayList = new ArrayList(q23.H(L, 10));
        for (az6 az6 : L) {
            arrayList.add((MessageModel) this.o.f.get((int) (az6.a & 4294967295L)));
        }
        return arrayList;
    }

    public final int f(long j) {
        int i;
        List b = b();
        int size = b.size();
        int i2 = 0;
        p23.E(b.size(), 0, size);
        int i3 = size - 1;
        while (true) {
            if (i2 > i3) {
                i = -(i2 + 1);
                break;
            }
            i = (i2 + i3) >>> 1;
            int intValue = Integer.valueOf(hhd.p(((MessageModel) b.get(i)).c, j)).intValue();
            if (intValue >= 0) {
                if (intValue <= 0) {
                    break;
                }
                i3 = i - 1;
            } else {
                i2 = i + 1;
            }
        }
        if (i >= 0) {
            return (int) (((az6) L().get(i)).a & 4294967295L);
        }
        return -1;
    }

    public final void s(b7c b7c, int i, List list) {
        qn8 qn8;
        b7c b7c2 = (chd) b7c;
        pg7 pg7 = (pg7) C(i);
        if (b7c2 instanceof gt8) {
            MessageModel messageModel = (MessageModel) pg7;
            b7c b7c3 = (gt8) b7c2;
            boolean z = b7c3 instanceof ao8;
            ao8 ao8 = z ? (ao8) b7c3 : null;
            if (ao8 != null) {
                qn8 qn82 = this.X;
                xn8 xn8 = new xn8(qn82, ao8);
                View view = ao8.a;
                a24.a0(view, xn8);
                View view2 = ao8.M0;
                if (view2 instanceof ho8) {
                    GestureDetector gestureDetector = new GestureDetector(((sn8) view).getContext(), new g33(ao8, new yn8(ao8, qn82)));
                    gestureDetector.setIsLongpressEnabled(true);
                    view2.setOnTouchListener(new cg3(gestureDetector, 4));
                    view2.setOnClickListener((View.OnClickListener) null);
                } else {
                    view2.setOnTouchListener((View.OnTouchListener) null);
                    a24.a0(view2, new xn8(ao8, qn82));
                }
                i0c i0c = view2 instanceof i0c ? (i0c) view2 : null;
                if (i0c != null) {
                    i0c.setOnClickListener(new yn8(qn82, ao8));
                }
                eb1 eb1 = new eb1(qn82, 5, ao8);
                view2.setOnLongClickListener(eb1);
                ((sn8) view).setOnLongClickListener(eb1);
                zq8 zq8 = view2 instanceof zq8 ? (zq8) view2 : null;
                if (zq8 != null) {
                    zv zvVar = r8;
                    zq8 zq82 = zq8;
                    qn8 = qn82;
                    zv zvVar2 = new zv(2, qn82, qn8.class, "onReplyClick", "onReplyClick(JJ)V", 0, 26);
                    zq82.setReplyClickListener(zvVar);
                    zq82.setForwardClickListener(new h87(1, qn8, qn8.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;)V", 0, 3));
                } else {
                    qn8 = qn82;
                }
                qn8 qn83 = qn8;
                zn8 zn8 = new zn8(qn83, ao8);
                wfe wfe = view2 instanceof wfe ? (wfe) view2 : null;
                if (wfe != null) {
                    wfe.setTextMessageLinkClickListener(zn8);
                }
                jf7 jf7 = view2 instanceof jf7 ? (jf7) view2 : null;
                if (jf7 != null) {
                    jf7.setOnLinkLongClickListener(new w48(qn83, 7, ao8));
                }
            }
            ir3 ir3 = b7c3 instanceof ir3 ? (ir3) b7c3 : null;
            if (ir3 != null) {
                ir3.M0 = this.w0;
            }
            ao8 ao82 = z ? (ao8) b7c3 : null;
            View view3 = ao82 != null ? ao82.M0 : null;
            i0c i0c2 = view3 instanceof i0c ? (i0c) view3 : null;
            if (i0c2 != null) {
                i0c2.setChipObserver(new w48(this, 10, b7c3));
            }
            b7c3.F(messageModel, list);
            gg6 gg6 = b7c3 instanceof gg6 ? (gg6) b7c3 : null;
            if (gg6 != null) {
                ig6 ig6 = (ig6) this.Z;
                ig6.b.add(gg6);
                if (ig6.c) {
                    ig6.c = !((ao8) gg6).Q(ig6.d, new zv(2, ig6, ig6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 22));
                }
                ((ao8) ((gg6) b7c3)).Q(ig6.d, new zv(2, this.Z, hg6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 27));
            }
            ao8 ao83 = z ? (ao8) b7c3 : null;
            if (ao83 != null) {
                t97 t97 = ao83.R0;
                if (t97.a()) {
                    ((yw6) t97.getValue()).setClickListener(this.y0);
                }
            }
        } else if (b7c2 instanceof x62) {
            ((x62) b7c2).A((y62) pg7);
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        if (i == a7a.e) {
            w62 w62 = new w62(viewGroup.getContext());
            b7c b7c = new b7c(w62);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int X2 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
            marginLayoutParams.setMargins(X2, X2, X2, X2);
            w62.setLayoutParams(marginLayoutParams);
            return b7c;
        }
        int i2 = -2013265921 & i;
        if ((i & 256) != 0) {
            Context context = viewGroup.getContext();
            return new y40(context, new sb1(context), 2);
        } else if (ht8.a(i2, 0)) {
            TextView textView = new TextView(viewGroup.getContext());
            gt8 gt8 = new gt8(textView);
            textView.setMaxWidth(a24.X(((float) 276) * dh4.c().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            float f = (float) 24;
            marginLayoutParams2.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
            marginLayoutParams2.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
            textView.setGravity(17);
            textView.setLayoutParams(marginLayoutParams2);
            nge nge = nte.a;
            jp2.f.b(textView, yq4.b);
            textView.setTextAlignment(4);
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            float f2 = (float) 12;
            float f3 = (float) 4;
            textView.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f4 = dh4.c().getDisplayMetrics().density * 12.0f;
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = f4;
            }
            gradientDrawable.setCornerRadii(fArr);
            textView.setBackground(gradientDrawable);
            return gt8;
        } else {
            boolean z = (i & 16) != 0;
            h87 h87 = this.Y;
            if (z) {
                Context context2 = viewGroup.getContext();
                return new y40(context2, new hm3(context2, h87), 3);
            } else if ((i & 64) != 0) {
                Context context3 = viewGroup.getContext();
                return new y40(context3, new c76(context3), 5);
            } else if ((i & 512) != 0) {
                Context context4 = viewGroup.getContext();
                return new y40(context4, new ubd(context4, h87), 6);
            } else if ((i & 32) != 0) {
                Context context5 = viewGroup.getContext();
                return new y40(context5, new qe5(context5), 4);
            } else if (!ht8.c(i2) && (i & 2) != 0 && !ht8.b(i2)) {
                return new c23(viewGroup.getContext(), h87, 2);
            } else {
                if (ht8.c(i2) && (i & 2) != 0 && !ht8.b(i2)) {
                    return new c23(viewGroup.getContext(), h87, 3);
                }
                if (!ht8.c(i2) && ht8.b(i2)) {
                    return new c23(viewGroup.getContext(), h87, 0);
                }
                if (ht8.c(i2) && ht8.b(i2)) {
                    return new c23(viewGroup.getContext(), h87, 1);
                }
                if (!ht8.c(i2) && (i & 4) != 0 && !ht8.b(i2)) {
                    Context context6 = viewGroup.getContext();
                    return new y40(context6, new zid(context6), 11);
                } else if (ht8.c(i2) && (i & 4) != 0 && !ht8.b(i2)) {
                    Context context7 = viewGroup.getContext();
                    return new y40(context7, new bjd(context7), 9);
                } else if (ht8.c(i2)) {
                    return new y40(viewGroup.getContext());
                } else {
                    if ((i & 4096) != 0) {
                        Context context8 = viewGroup.getContext();
                        return new y40(context8, new xk0(context8), 1);
                    } else if ((i & 128) != 0) {
                        return new y40(viewGroup.getContext(), new itd(viewGroup.getContext(), new ir7(viewGroup.getContext(), 1)), 7);
                    } else {
                        if ((i & 16384) != 0) {
                            return new y40(viewGroup.getContext(), new itd(viewGroup.getContext(), new ir7(viewGroup.getContext(), 0)), 7);
                        }
                        if ((32768 & i) != 0) {
                            return new y40(viewGroup.getContext(), new itd(viewGroup.getContext(), new ir7(viewGroup.getContext(), 2)), 7);
                        }
                        if ((i & 8) != 0) {
                            Context context9 = viewGroup.getContext();
                            return new y40(context9, new r40(context9, h87, this.z0), 0);
                        } else if ((65536 & i) != 0) {
                            Context context10 = viewGroup.getContext();
                            return new y40(context10, new a6f(context10), 10);
                        } else if ((33554432 & i) != 0) {
                            return new y40(viewGroup.getContext());
                        } else {
                            String e = ht8.e(i2);
                            String binaryString = Integer.toBinaryString(i);
                            throw new IllegalStateException(("unsupported view type=" + e + " binary=" + binaryString).toString());
                        }
                    }
                }
            }
        }
    }
}
