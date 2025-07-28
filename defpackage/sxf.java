package defpackage;

import android.opengl.EGLSurface;
import org.webrtc.RendererCommon;

/* renamed from: sxf  reason: default package */
public final class sxf extends b97 implements u16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tc1 b;
    public final /* synthetic */ sc1 c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sxf(sc1 sc1, Object obj, tc1 tc1) {
        super(1);
        this.c = sc1;
        this.o = obj;
        this.b = tc1;
    }

    public final Object invoke(Object obj) {
        xwb xwb;
        switch (this.a) {
            case 0:
                rc1 rc1 = (rc1) obj;
                sc1 sc1 = this.c;
                um1 um1 = (um1) sc1;
                um1.getClass();
                um1.k = (RendererCommon.GlDrawer) this.o;
                long nanoTime = System.nanoTime();
                vm1 vm1 = um1.l;
                vm1.g = nanoTime;
                vm1.f = 0;
                vm1.h = 0;
                vm1.i = 0;
                vm1.c.set(0);
                vm1.d.set(0);
                tc1 tc1 = um1.g;
                if (tc1 == null || (xwb = tc1.a) == null) {
                    throw new RuntimeException("Render is missing inside onInitialize() callback");
                }
                int incrementAndGet = um1.m.incrementAndGet();
                xwb.log(um1.j, "Instance " + um1.b + " initialized. Total count is " + incrementAndGet);
                this.b.i.add(sc1);
                return jue.a;
            default:
                s16 s16 = (s16) this.o;
                rc1 rc12 = (rc1) obj;
                try {
                    tc1 tc12 = this.b;
                    sc1 sc12 = this.c;
                    tc12.getClass();
                    EGLSurface eGLSurface = sc12.a;
                    sc12.a = null;
                    rc12.e(eGLSurface);
                    return jue.a;
                } finally {
                    if (s16 != null) {
                        s16.invoke();
                    }
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sxf(tc1 tc1, sc1 sc1, s16 s16) {
        super(1);
        this.b = tc1;
        this.c = sc1;
        this.o = s16;
    }
}
