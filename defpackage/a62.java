package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: a62  reason: default package */
public final class a62 implements hx9 {
    public Object X;
    public int a;
    public long b;
    public long c;
    public Object o;

    public static ud3 b(dzf dzf, a aVar, int i) {
        p4g p4g = aVar.J0;
        ud3 ud3 = p4g == null ? null : p4g.o;
        if (ud3 != null && ud3.b) {
            int[] iArr = ud3.o;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = ud3.Y;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    }
                }
            }
            if (dzf.n < ud3.X) {
                return ud3;
            }
            return null;
        }
        return null;
    }

    public b62 a() {
        if (((List) this.X) == null) {
            this.X = Collections.emptyList();
        }
        return new b62((h62) this.o, this.a, this.b, this.c, (List) this.X);
    }

    public void l(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        if (((qa6) this.o).a()) {
            ofc ofc = (ofc) nfc.o().b;
            if (ofc == null || ofc.b) {
                dzf dzf = (dzf) ((qa6) this.o).y0.get((zk) this.X);
                if (dzf != null) {
                    a aVar = dzf.d;
                    if (aVar instanceof a) {
                        a aVar2 = aVar;
                        long j2 = 0;
                        boolean z = true;
                        boolean z2 = this.b > 0;
                        int i8 = aVar2.E0;
                        if (ofc != null) {
                            boolean z3 = z2 & ofc.c;
                            int i9 = ofc.o;
                            int i10 = ofc.X;
                            i3 = ofc.a;
                            if (aVar2.J0 != null && !aVar2.c()) {
                                ud3 b2 = b(dzf, aVar2, this.a);
                                if (b2 != null) {
                                    if (!b2.c || this.b <= 0) {
                                        z = false;
                                    }
                                    i10 = b2.X;
                                    z3 = z;
                                } else {
                                    return;
                                }
                            }
                            i2 = i9;
                            i = i10;
                        } else {
                            i3 = 0;
                            i = 100;
                            i2 = 5000;
                        }
                        qa6 qa6 = (qa6) this.o;
                        if (task.h()) {
                            i5 = 0;
                            i4 = 0;
                        } else {
                            if (((n6g) task).d) {
                                i5 = 100;
                            } else {
                                ApiException e = task.e();
                                if (e instanceof ApiException) {
                                    Status status = e.a;
                                    i7 = status.a;
                                    nd3 nd3 = status.o;
                                    if (nd3 != null) {
                                        i4 = nd3.b;
                                        i5 = i7;
                                    }
                                } else {
                                    i7 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                                }
                                i5 = i7;
                            }
                            i4 = -1;
                        }
                        if (z2) {
                            long j3 = this.b;
                            long j4 = this.c;
                            long currentTimeMillis = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        t39 t39 = new t39(this.a, i5, i4, j, j2, (String) null, (String) null, i8, i6);
                        qa6.getClass();
                        nzf nzf = new nzf(t39, i3, (long) i2, i);
                        z59 z59 = qa6.B0;
                        z59.sendMessage(z59.obtainMessage(18, nzf));
                    }
                }
            }
        }
    }
}
