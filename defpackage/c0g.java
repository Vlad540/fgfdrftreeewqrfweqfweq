package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: c0g  reason: default package */
public final class c0g extends hzf {
    public final vde b;
    public final /* synthetic */ int c;
    public final Object d;

    public c0g(int i, vde vde) {
        super(i);
        this.b = vde;
    }

    private final /* bridge */ /* synthetic */ void i(d4b d4b, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(d4b d4b, boolean z) {
    }

    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.b.c(runtimeException);
    }

    public final void c(dzf dzf) {
        try {
            h(dzf);
        } catch (DeadObjectException e) {
            a(j0g.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(j0g.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final /* bridge */ /* synthetic */ void d(d4b d4b, boolean z) {
        int i = this.c;
    }

    public final boolean f(dzf dzf) {
        switch (this.c) {
            case 0:
                ((pzf) this.d).a.getClass();
                return true;
            default:
                pzf pzf = (pzf) dzf.h.get((ih7) this.d);
                if (pzf == null) {
                    return false;
                }
                pzf.a.getClass();
                return true;
        }
    }

    public final ib5[] g(dzf dzf) {
        switch (this.c) {
            case 0:
                ((pzf) this.d).a.getClass();
                return null;
            default:
                pzf pzf = (pzf) dzf.h.get((ih7) this.d);
                if (pzf != null) {
                    pzf.a.getClass();
                }
                return null;
        }
    }

    public final void h(dzf dzf) {
        switch (this.c) {
            case 0:
                v4b v4b = ((pzf) this.d).a;
                ((n8c) ((i6g) v4b.c).a).accept(dzf.d, this.b);
                ih7 ih7 = (ih7) ((lt4) ((pzf) this.d).a.b).c;
                if (ih7 != null) {
                    dzf.h.put(ih7, (pzf) this.d);
                    return;
                }
                return;
            default:
                pzf pzf = (pzf) dzf.h.remove((ih7) this.d);
                vde vde = this.b;
                if (pzf != null) {
                    ((n8c) ((i6g) pzf.b.a).c).accept(dzf.d, vde);
                    lt4 lt4 = (lt4) pzf.a.b;
                    lt4.b = null;
                    lt4.c = null;
                    return;
                }
                vde.d(Boolean.FALSE);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0g(ih7 ih7, vde vde) {
        this(4, vde);
        this.c = 1;
        this.d = ih7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0g(pzf pzf, vde vde) {
        this(3, vde);
        this.c = 0;
        this.d = pzf;
    }
}
