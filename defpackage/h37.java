package defpackage;

/* renamed from: h37  reason: default package */
public class h37 extends i47 implements d73 {
    public final boolean a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h37(g37 g37) {
        super(true);
        boolean z = true;
        initParentJob(g37);
        vw2 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        ww2 ww2 = parentHandle$kotlinx_coroutines_core instanceof ww2 ? (ww2) parentHandle$kotlinx_coroutines_core : null;
        if (ww2 != null) {
            i47 i47 = ww2.a;
            i47 i472 = i47 == null ? null : i47;
            if (i472 != null) {
                while (true) {
                    if (!i472.getHandlesException$kotlinx_coroutines_core()) {
                        vw2 parentHandle$kotlinx_coroutines_core2 = i472.getParentHandle$kotlinx_coroutines_core();
                        ww2 ww22 = parentHandle$kotlinx_coroutines_core2 instanceof ww2 ? (ww2) parentHandle$kotlinx_coroutines_core2 : null;
                        if (ww22 != null) {
                            i472 = ww22.a;
                            if (i472 == null) {
                                i472 = null;
                                continue;
                            }
                            if (i472 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        z = false;
        this.a = z;
    }

    public final boolean H() {
        return makeCompleting$kotlinx_coroutines_core(jue.a);
    }

    public final boolean getHandlesException$kotlinx_coroutines_core() {
        return this.a;
    }

    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
