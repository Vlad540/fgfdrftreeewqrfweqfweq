package defpackage;

import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: vd0  reason: default package */
public final /* synthetic */ class vd0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BacklogWorker b;

    public /* synthetic */ vd0(BacklogWorker backlogWorker, int i) {
        this.a = i;
        this.b = backlogWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((nqc) this.b.getTamComponent()).s();
            default:
                return (mtf) ((nqc) this.b.getTamComponent()).getAccessor().c(mtf.class);
        }
    }
}
