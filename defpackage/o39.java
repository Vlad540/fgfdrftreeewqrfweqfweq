package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: o39  reason: default package */
public final class o39 {
    public final h39 a;
    public final char[] b;
    public final n39 c = new n39(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    public final Typeface d;

    public o39(Typeface typeface, h39 h39) {
        int i;
        int i2;
        this.d = typeface;
        this.a = h39;
        int a2 = h39.a(6);
        if (a2 != 0) {
            int i3 = a2 + h39.a;
            i = ((ByteBuffer) h39.o).getInt(((ByteBuffer) h39.o).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[(i * 2)];
        int a3 = h39.a(6);
        if (a3 != 0) {
            int i4 = a3 + h39.a;
            i2 = ((ByteBuffer) h39.o).getInt(((ByteBuffer) h39.o).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            hte hte = new hte(this, i5);
            g39 c2 = hte.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.o).getInt(a4 + c2.a) : 0, this.b, i5 * 2);
            e07.j("invalid metadata codepoint length", hte.b() > 0);
            this.c.a(hte, 0, hte.b() - 1);
        }
    }
}
