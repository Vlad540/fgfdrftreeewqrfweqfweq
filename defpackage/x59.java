package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: x59  reason: default package */
public final class x59 extends FutureTask {
    public final /* synthetic */ ww a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x59(ww wwVar, uh uhVar) {
        super(uhVar);
        this.a = wwVar;
    }

    public final void done() {
        ww wwVar = this.a;
        try {
            Object obj = get();
            if (!wwVar.X.get()) {
                wwVar.b(obj);
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        } catch (CancellationException unused2) {
            if (!wwVar.X.get()) {
                wwVar.b((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
