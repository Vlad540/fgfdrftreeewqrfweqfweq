package defpackage;

/* renamed from: sda  reason: default package */
public final class sda extends Thread {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sda(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                eie eie = (eie) this.b;
                if (eie != null) {
                    eie.a(getPriority());
                }
                super.run();
                return;
            case 1:
                ahd ahd = (ahd) this.b;
                ahd.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (ahd.f());
                return;
            case 2:
                qm0 qm0 = (qm0) this.b;
                qm0.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (qm0.j());
                return;
            default:
                ((s16) this.b).invoke();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sda(String str, Runnable runnable) {
        super(runnable, str);
        this.a = 0;
    }

    public sda(s16 s16) {
        this.a = 3;
        this.b = s16;
    }
}
