package defpackage;

import java.io.Serializable;

/* renamed from: qn3  reason: default package */
public final class qn3 extends lbe implements Serializable {
    public int c;
    public String o;

    public qn3(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        int i;
        str.getClass();
        if (str.equals("verifyResult")) {
            String M = jjd.M(ws8);
            if (M != null) {
                if (M.equals("GOOD")) {
                    i = 1;
                } else if (M.equals("BAD")) {
                    i = 2;
                } else if (M.equals("UNDEFINED")) {
                    i = 3;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(M));
                }
                this.c = i;
                return;
            }
            throw new NullPointerException("Name is null");
        } else if (!str.equals("name")) {
            ws8.z();
        } else {
            this.o = jjd.M(ws8);
        }
    }

    public final String toString() {
        int i = this.c;
        String str = this.o;
        StringBuilder sb = new StringBuilder("{verifyResult=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNDEFINED" : "BAD" : "GOOD");
        sb.append(", name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
