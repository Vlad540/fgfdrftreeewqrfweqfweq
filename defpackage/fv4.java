package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: fv4  reason: default package */
public final class fv4 extends jgd {
    public final /* synthetic */ int X = 0;
    public u16 Y;
    public final Object Z;

    public fv4(ku2 ku2, ExecutorService executorService) {
        super(executorService);
        this.Z = ku2;
    }

    public /* bridge */ /* synthetic */ void H(chd chd, int i) {
        switch (this.X) {
            case 2:
                J((pp2) chd, i);
                return;
            default:
                fv4.super.H(chd, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fv4, ig7] */
    /* JADX WARNING: type inference failed for: r1v0, types: [pp2, java.lang.Object, b7c] */
    public void J(pp2 pp2, int i) {
        ? r1 = pp2;
        pi2 pi2 = (pi2) this.o.f.get(i);
        f fVar = new f(1, (ku2) this.Z, ku2.class, "onChatItemClick", "onChatItemClick(J)V", 0, 14);
        zv zvVar = new zv(2, (ku2) this.Z, ku2.class, "onChatItemLongTap", "onChatItemLongTap(JLandroid/view/View;)V", 0, 8);
        r1.A(pi2);
        p32 p32 = r1.a;
        a24.Z(p32, 300, new ub(fVar, 15, pi2));
        p32.setOnLongClickListener(new d32(zvVar, pi2, r1, 4));
    }

    public /* bridge */ /* synthetic */ void r(b7c b7c, int i) {
        switch (this.X) {
            case 2:
                J((pp2) b7c, i);
                return;
            default:
                fv4.super.r(b7c, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [fv4, jgd, ig7] */
    public final void s(b7c b7c, int i, List list) {
        switch (this.X) {
            case 0:
                ev4 ev4 = (ev4) b7c;
                if (!list.isEmpty()) {
                    for (Object obj : list) {
                        if (obj instanceof gud) {
                            ArrayList arrayList = new ArrayList();
                            for (Object next : list) {
                                if (next instanceof gx1) {
                                    arrayList.add(next);
                                }
                            }
                            gx1 gx1 = (gx1) o23.f0(arrayList);
                            if (gx1 != null) {
                                ev4.F(gx1.a);
                                return;
                            } else {
                                H(ev4, i);
                                return;
                            }
                        }
                    }
                }
                H(ev4, i);
                return;
            case 1:
                sud sud = (sud) b7c;
                if (!list.isEmpty()) {
                    for (Object obj2 : list) {
                        if (obj2 instanceof gud) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next2 : list) {
                                if (next2 instanceof gud) {
                                    arrayList2.add(next2);
                                }
                            }
                            eud eud = (gud) o23.X(arrayList2);
                            if (eud == null) {
                                H(sud, i);
                                return;
                            } else if (eud instanceof eud) {
                                sud.G(eud.a);
                                return;
                            } else if (eud instanceof fud) {
                                sud.F(((fud) eud).a);
                                return;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                H(sud, i);
                return;
            default:
                pp2 pp2 = (pp2) b7c;
                u16 u16 = this.Y;
                mu muVar = this.o;
                if (u16 != null) {
                    u16.invoke(Long.valueOf(((pi2) muVar.f.get(i)).a));
                }
                if (!list.isEmpty()) {
                    u2 u2Var = new u2(7);
                    for (Object next3 : list) {
                        ni2 ni2 = next3 instanceof ni2 ? (ni2) next3 : null;
                        if (ni2 != null) {
                            u2Var.M1(ni2);
                        }
                    }
                    pp2.B((pi2) muVar.f.get(i), u2Var);
                    return;
                }
                J(pp2, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ev4, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                return new ev4(viewGroup.getContext(), (ShapeDrawable) this.Z, (gw2) this.Y);
            case 1:
                return new sud(viewGroup.getContext(), (ShapeDrawable) this.Z, (gw2) this.Y);
            default:
                return new b7c(new p32(viewGroup.getContext()));
        }
    }

    public fv4(ExecutorService executorService, gw2 gw2, byte b) {
        super(executorService);
        this.Y = gw2;
        this.Z = new ShapeDrawable(new OvalShape());
    }

    public fv4(ExecutorService executorService, gw2 gw2) {
        super(executorService);
        this.Y = gw2;
        this.Z = new ShapeDrawable(new OvalShape());
    }
}
