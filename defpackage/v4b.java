package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v4b  reason: default package */
public final class v4b implements jl0, zhd, fod, g1e, ktc, uw9, u1e, hx9 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ v4b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static bgd i(JSONObject jSONObject) {
        ge1 a2 = ge1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        return new bgd(j, string.equals("STREAM") ? m5c.c : string.equals("RECORD") ? m5c.b : m5c.a, a2, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), r1g.x(jSONObject, "recordExternalMovieId"), r1g.x(jSONObject, "recordExternalOwnerId"));
    }

    public static u4b m() {
        String str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String readLine = randomAccessFile.readLine(); readLine != null; readLine = randomAccessFile.readLine()) {
                    sb.append(readLine);
                }
                str = sb.toString();
                urd.l(randomAccessFile, (Throwable) null);
            } catch (Throwable th) {
                urd.l(randomAccessFile, th);
                throw th;
            }
        } catch (IOException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        List q0 = h0e.q0(str, new String[]{" "}, false, 6);
        if (q0.size() <= 22) {
            return null;
        }
        try {
            return new u4b(Long.parseLong((String) q0.get(13)), Long.parseLong((String) q0.get(14)), Long.parseLong((String) q0.get(15)), Long.parseLong((String) q0.get(16)), Long.parseLong((String) q0.get(21)));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public nsf M(View view, nsf nsf) {
        boolean z;
        int i;
        x3 x3Var = (x3) this.c;
        int i2 = x3Var.a;
        xp0 xp0 = (xp0) this.b;
        xp0.getClass();
        lsf lsf = nsf.a;
        qy6 f = lsf.f(7);
        qy6 f2 = lsf.f(32);
        int i3 = f.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) xp0.b;
        bottomSheetBehavior.w = i3;
        boolean z2 = gwf.z(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.o;
        if (z3) {
            int a2 = nsf.a();
            bottomSheetBehavior.v = a2;
            paddingBottom = a2 + x3Var.c;
        }
        int i4 = x3Var.b;
        boolean z4 = bottomSheetBehavior.p;
        int i5 = f.a;
        if (z4) {
            paddingLeft = (z2 ? i4 : i2) + i5;
        }
        boolean z5 = bottomSheetBehavior.q;
        int i6 = f.c;
        if (z5) {
            if (!z2) {
                i2 = i4;
            }
            paddingRight = i2 + i6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i5) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z = true;
        }
        if (!bottomSheetBehavior.u || marginLayoutParams.topMargin == (i = f.b)) {
            z6 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z6) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = xp0.a;
        if (z7) {
            bottomSheetBehavior.m = f2.d;
        }
        if (z3 || z7) {
            bottomSheetBehavior.R();
        }
        return nsf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v4, types: [ul7, java.lang.Object, h1e] */
    /* JADX WARNING: type inference failed for: r2v9, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object, hqf] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (")".equals(fqf.b(r8, r11)) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(byte[] r20, int r21, int r22, t1e r23, nf3 r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            int r6 = r1 + r22
            java.lang.Object r7 = r0.b
            ija r7 = (ija) r7
            r8 = r20
            r7.E(r6, r8)
            r7.G(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xqf.d(r7)     // Catch:{ ParserException -> 0x0444 }
        L_0x001e:
            java.nio.charset.Charset r6 = f22.c
            java.lang.String r6 = r7.h(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0030:
            r9 = r2
            r8 = r3
        L_0x0032:
            if (r8 != r3) goto L_0x0056
            int r9 = r7.b
            java.nio.charset.Charset r8 = f22.c
            java.lang.String r8 = r7.h(r8)
            if (r8 != 0) goto L_0x0040
            r8 = r2
            goto L_0x0032
        L_0x0040:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x004a
            r8 = r4
            goto L_0x0032
        L_0x004a:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0054
            r8 = r5
            goto L_0x0032
        L_0x0054:
            r8 = 3
            goto L_0x0032
        L_0x0056:
            r7.G(r9)
            if (r8 == 0) goto L_0x03f5
            if (r8 != r5) goto L_0x006a
        L_0x005d:
            java.nio.charset.Charset r8 = f22.c
            java.lang.String r8 = r7.h(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0030
            goto L_0x005d
        L_0x006a:
            r9 = 0
            if (r8 != r4) goto L_0x03b3
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x03ab
            java.nio.charset.Charset r8 = f22.c
            r7.h(r8)
            java.lang.Object r8 = r0.c
            fqf r8 = (fqf) r8
            java.lang.StringBuilder r11 = r8.b
            r11.setLength(r2)
            int r12 = r7.b
        L_0x0083:
            java.nio.charset.Charset r13 = f22.c
            java.lang.String r13 = r7.h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x03a7
            byte[] r13 = r7.a
            int r14 = r7.b
            ija r8 = r8.a
            r8.E(r14, r13)
            r8.G(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00a0:
            fqf.c(r8)
            int r13 = r8.a()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x00b1
        L_0x00ae:
            r4 = r9
            goto L_0x0117
        L_0x00b1:
            java.nio.charset.Charset r13 = f22.c
            java.lang.String r10 = r8.s(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00ae
        L_0x00c0:
            int r10 = r8.b
            java.lang.String r13 = fqf.b(r8, r11)
            if (r13 != 0) goto L_0x00c9
            goto L_0x00ae
        L_0x00c9:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d4
            r8.G(r10)
            r4 = r15
            goto L_0x0117
        L_0x00d4:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x0109
            int r10 = r8.b
            int r13 = r8.c
            r16 = r2
        L_0x00e2:
            if (r10 >= r13) goto L_0x00fa
            if (r16 != 0) goto L_0x00fa
            byte[] r4 = r8.a
            int r17 = r10 + 1
            byte r4 = r4[r10]
            char r4 = (char) r4
            r10 = 41
            if (r4 != r10) goto L_0x00f3
            r4 = r5
            goto L_0x00f4
        L_0x00f3:
            r4 = r2
        L_0x00f4:
            r16 = r4
            r10 = r17
            r4 = 2
            goto L_0x00e2
        L_0x00fa:
            int r10 = r10 + r3
            int r4 = r8.b
            int r10 = r10 - r4
            java.nio.charset.Charset r4 = f22.c
            java.lang.String r4 = r8.s(r10, r4)
            java.lang.String r4 = r4.trim()
            goto L_0x010a
        L_0x0109:
            r4 = r9
        L_0x010a:
            java.lang.String r10 = fqf.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0117
            goto L_0x00ae
        L_0x0117:
            if (r4 == 0) goto L_0x039c
            java.lang.String r10 = fqf.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0125
            goto L_0x039c
        L_0x0125:
            hqf r10 = new hqf
            r10.<init>()
            r10.a = r15
            r10.b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.c = r13
            r10.d = r15
            r10.e = r9
            r10.g = r2
            r10.i = r2
            r10.j = r3
            r10.k = r3
            r10.l = r3
            r10.m = r3
            r10.n = r3
            r10.p = r3
            r10.q = r2
            boolean r13 = r15.equals(r4)
            if (r13 == 0) goto L_0x0151
            goto L_0x01b6
        L_0x0151:
            r13 = 91
            int r13 = r4.indexOf(r13)
            if (r13 == r3) goto L_0x0176
            java.util.regex.Pattern r14 = fqf.c
            java.lang.String r9 = r4.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x0172
            java.lang.String r9 = r9.group(r5)
            r9.getClass()
            r10.d = r9
        L_0x0172:
            java.lang.String r4 = r4.substring(r2, r13)
        L_0x0176:
            int r9 = oze.a
            java.lang.String r9 = "\\."
            java.lang.String[] r4 = r4.split(r9, r3)
            r9 = r4[r2]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r3) goto L_0x0196
            java.lang.String r14 = r9.substring(r2, r13)
            r10.b = r14
            int r13 = r13 + r5
            java.lang.String r9 = r9.substring(r13)
            r10.a = r9
            goto L_0x0198
        L_0x0196:
            r10.b = r9
        L_0x0198:
            int r9 = r4.length
            if (r9 <= r5) goto L_0x01b6
            int r9 = r4.length
            int r13 = r4.length
            if (r9 > r13) goto L_0x01a1
            r13 = r5
            goto L_0x01a2
        L_0x01a1:
            r13 = r2
        L_0x01a2:
            oyb.d(r13)
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r5, r9)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r4 = java.util.Arrays.asList(r4)
            r9.<init>(r4)
            r10.c = r9
        L_0x01b6:
            r4 = r2
            r9 = 0
        L_0x01b8:
            java.lang.String r13 = "}"
            if (r4 != 0) goto L_0x038a
            int r4 = r8.b
            java.lang.String r9 = fqf.b(r8, r11)
            if (r9 == 0) goto L_0x01cd
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            r14 = r2
            goto L_0x01ce
        L_0x01cd:
            r14 = r5
        L_0x01ce:
            if (r14 != 0) goto L_0x0382
            r8.G(r4)
            fqf.c(r8)
            java.lang.String r4 = fqf.a(r8, r11)
            boolean r17 = r15.equals(r4)
            if (r17 == 0) goto L_0x01e2
            goto L_0x0382
        L_0x01e2:
            java.lang.String r2 = ":"
            java.lang.String r3 = fqf.b(r8, r11)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01f0
            goto L_0x0382
        L_0x01f0:
            fqf.c(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L_0x01f9:
            java.lang.String r5 = ";"
            if (r3 != 0) goto L_0x0225
            int r0 = r8.b
            r22 = r3
            java.lang.String r3 = fqf.b(r8, r11)
            if (r3 != 0) goto L_0x0209
            r0 = 0
            goto L_0x0229
        L_0x0209:
            boolean r18 = r13.equals(r3)
            if (r18 != 0) goto L_0x021e
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0216
            goto L_0x021e
        L_0x0216:
            r2.append(r3)
            r0 = r19
            r3 = r22
            goto L_0x01f9
        L_0x021e:
            r8.G(r0)
            r3 = 1
            r0 = r19
            goto L_0x01f9
        L_0x0225:
            java.lang.String r0 = r2.toString()
        L_0x0229:
            if (r0 == 0) goto L_0x0382
            boolean r2 = r15.equals(r0)
            if (r2 == 0) goto L_0x0233
            goto L_0x0382
        L_0x0233:
            int r2 = r8.b
            java.lang.String r3 = fqf.b(r8, r11)
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0240
            goto L_0x0249
        L_0x0240:
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0382
            r8.G(r2)
        L_0x0249:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x025c
            r2 = 1
            int r0 = b33.a(r0, r2)
            r10.f = r0
            r10.g = r2
            goto L_0x0382
        L_0x025c:
            r2 = 1
            java.lang.String r3 = "background-color"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x026f
            int r0 = b33.a(r0, r2)
            r10.h = r0
            r10.i = r2
            goto L_0x0382
        L_0x026f:
            java.lang.String r3 = "ruby-position"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0290
            java.lang.String r3 = "over"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0283
            r10.p = r2
            goto L_0x0382
        L_0x0283:
            java.lang.String r2 = "under"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r0 = 2
            r10.p = r0
            goto L_0x0382
        L_0x0290:
            java.lang.String r2 = "text-combine-upright"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02b0
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x02ab
            java.lang.String r2 = "digits"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r0 = 0
            goto L_0x02ac
        L_0x02ab:
            r0 = 1
        L_0x02ac:
            r10.q = r0
            goto L_0x0382
        L_0x02b0:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02c5
            java.lang.String r2 = "underline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r0 = 1
            r10.k = r0
            goto L_0x0382
        L_0x02c5:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02d5
            java.lang.String r0 = fja.A(r0)
            r10.e = r0
            goto L_0x0382
        L_0x02d5:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = "bold"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r2 = 1
            r10.l = r2
            goto L_0x0382
        L_0x02ea:
            r2 = 1
            java.lang.String r3 = "font-style"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02ff
            java.lang.String r3 = "italic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0382
            r10.m = r2
            goto L_0x0382
        L_0x02ff:
            java.lang.String r2 = "font-size"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0382
            java.lang.String r2 = fja.A(r0)
            java.util.regex.Pattern r3 = fqf.d
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x032e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid font-size: '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            ez3.j0(r0)
            goto L_0x0382
        L_0x032e:
            r0 = 2
            java.lang.String r3 = r2.group(r0)
            r3.getClass()
            int r0 = r3.hashCode()
            switch(r0) {
                case 37: goto L_0x0355;
                case 3240: goto L_0x034a;
                case 3592: goto L_0x033f;
                default: goto L_0x033d;
            }
        L_0x033d:
            r0 = -1
            goto L_0x035f
        L_0x033f:
            java.lang.String r0 = "px"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0348
            goto L_0x033d
        L_0x0348:
            r0 = 2
            goto L_0x035f
        L_0x034a:
            java.lang.String r0 = "em"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0353
            goto L_0x033d
        L_0x0353:
            r0 = 1
            goto L_0x035f
        L_0x0355:
            java.lang.String r0 = "%"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x035e
            goto L_0x033d
        L_0x035e:
            r0 = 0
        L_0x035f:
            switch(r0) {
                case 0: goto L_0x0371;
                case 1: goto L_0x036c;
                case 2: goto L_0x0368;
                default: goto L_0x0362;
            }
        L_0x0362:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0368:
            r0 = 1
            r10.n = r0
            goto L_0x0375
        L_0x036c:
            r0 = 1
            r3 = 2
            r10.n = r3
            goto L_0x0375
        L_0x0371:
            r0 = 1
            r3 = 3
            r10.n = r3
        L_0x0375:
            java.lang.String r2 = r2.group(r0)
            r2.getClass()
            float r0 = java.lang.Float.parseFloat(r2)
            r10.o = r0
        L_0x0382:
            r0 = r19
            r4 = r14
            r2 = 0
            r3 = -1
            r5 = 1
            goto L_0x01b8
        L_0x038a:
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x0393
            r12.add(r10)
        L_0x0393:
            r0 = r19
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            r9 = 0
            goto L_0x00a0
        L_0x039c:
            r1.addAll(r12)
        L_0x039f:
            r0 = r19
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            goto L_0x0030
        L_0x03a7:
            r0 = r19
            goto L_0x0083
        L_0x03ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x03b3:
            r0 = 3
            if (r8 != r0) goto L_0x039f
            java.util.regex.Pattern r0 = sqf.a
            java.nio.charset.Charset r0 = f22.c
            java.lang.String r2 = r7.h(r0)
            if (r2 != 0) goto L_0x03c2
            r9 = 0
            goto L_0x03ef
        L_0x03c2:
            java.util.regex.Pattern r3 = sqf.a
            java.util.regex.Matcher r4 = r3.matcher(r2)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x03d4
            r5 = 0
            jqf r9 = sqf.d(r5, r4, r7, r1)
            goto L_0x03ef
        L_0x03d4:
            r5 = 0
            java.lang.String r0 = r7.h(r0)
            if (r0 != 0) goto L_0x03dd
        L_0x03db:
            r9 = r5
            goto L_0x03ef
        L_0x03dd:
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r3 = r0.matches()
            if (r3 == 0) goto L_0x03db
            java.lang.String r2 = r2.trim()
            jqf r9 = sqf.d(r2, r0, r7, r1)
        L_0x03ef:
            if (r9 == 0) goto L_0x039f
            r6.add(r9)
            goto L_0x039f
        L_0x03f5:
            ul7 r0 = new ul7
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.a = r1
            int r1 = r6.size()
            r2 = 2
            int r1 = r1 * r2
            long[] r1 = new long[r1]
            r0.b = r1
            r1 = 0
        L_0x0410:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x042e
            java.lang.Object r3 = r6.get(r1)
            jqf r3 = (jqf) r3
            int r4 = r1 * 2
            java.lang.Object r5 = r0.b
            long[] r5 = (long[]) r5
            long r7 = r3.b
            r5[r4] = r7
            r7 = 1
            int r4 = r4 + r7
            long r8 = r3.c
            r5[r4] = r8
            int r1 = r1 + r7
            goto L_0x0410
        L_0x042e:
            java.lang.Object r1 = r0.b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.c = r1
            java.util.Arrays.sort(r1)
            r1 = r23
            r2 = r24
            n06.F(r0, r1, r2)
            return
        L_0x0444:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4b.Q(byte[], int, int, t1e, nf3):void");
    }

    public int R() {
        return 1;
    }

    public void a(Object obj) {
        zhd zhd = (zhd) this.b;
        try {
            ((mhd) this.c).c.accept(obj);
            zhd.a(obj);
        } catch (Throwable th) {
            ek8.a0(th);
            zhd.onError(th);
        }
    }

    public long b(long j) {
        uq7 uq7 = (uq7) this.b;
        Long l = (Long) uq7.c(j);
        if (l == null) {
            le4 le4 = (le4) this.c;
            long j2 = le4.a;
            le4.a = 1 + j2;
            l = Long.valueOf(j2);
            uq7.f(j, l);
        }
        return l.longValue();
    }

    public void c() {
        byte[] bArr = mze.f;
        yze yze = (yze) this.c;
        yze.getClass();
        yze.F(bArr.length, bArr);
    }

    public void d(xi4 xi4) {
        ((zhd) this.b).d(xi4);
    }

    public void e(cke cke, i75 i75, pse pse) {
    }

    public void f(ija ija) {
        mse mse;
        if (ija.u() == 0 && (ija.u() & 128) != 0) {
            ija.H(6);
            int a2 = ija.a() / 4;
            int i = 0;
            while (true) {
                mse = (mse) this.c;
                if (i >= a2) {
                    break;
                }
                wx1 wx1 = (wx1) this.b;
                ija.e(0, wx1.b, 4);
                wx1.q(0);
                int i2 = wx1.i(16);
                wx1.t(3);
                if (i2 == 0) {
                    wx1.t(13);
                } else {
                    int i3 = wx1.i(13);
                    if (mse.w0.get(i3) == null) {
                        mse.w0.put(i3, new mtc(new ope(mse, i3)));
                        mse.C0++;
                    }
                }
                i++;
            }
            if (mse.a != 2) {
                mse.w0.remove(0);
            }
        }
    }

    public il0 g(q74 q74, long j) {
        int f;
        il0 il0;
        q74 q742 = q74;
        long j2 = q742.o;
        int min = (int) Math.min(20000, q742.c - j2);
        yze yze = (yze) this.c;
        yze.E(min);
        q742.r(yze.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (yze.c() >= 4) {
            if (mi5.f(yze.b, yze.a) != 442) {
                yze.I(1);
            } else {
                yze.I(4);
                long f2 = rib.f(yze);
                if (f2 != -9223372036854775807L) {
                    long b2 = ((bke) this.b).b(f2);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new il0(-1, b2, j2);
                        }
                        il0 = new il0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        il0 = new il0(0, -9223372036854775807L, j2 + ((long) yze.b));
                    } else {
                        i2 = yze.b;
                        j3 = b2;
                    }
                    return il0;
                }
                int i3 = yze.c;
                if (yze.c() >= 10) {
                    yze.I(9);
                    int v = yze.v() & 7;
                    if (yze.c() >= v) {
                        yze.I(v);
                        if (yze.c() >= 4) {
                            if (mi5.f(yze.b, yze.a) == 443) {
                                yze.I(4);
                                int A = yze.A();
                                if (yze.c() < A) {
                                    yze.H(i3);
                                } else {
                                    yze.I(A);
                                }
                            }
                            while (true) {
                                if (yze.c() < 4 || (f = mi5.f(yze.b, yze.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                yze.I(4);
                                if (yze.c() < 2) {
                                    yze.H(i3);
                                    break;
                                }
                                yze.H(Math.min(yze.c, yze.b + yze.A()));
                            }
                        } else {
                            yze.H(i3);
                        }
                    } else {
                        yze.H(i3);
                    }
                } else {
                    yze.H(i3);
                }
                i = yze.b;
            }
        }
        return j3 != -9223372036854775807L ? new il0(-2, j3, j2 + ((long) i)) : il0.d;
    }

    public int h(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = mze.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void j(i75 i75, pse pse) {
        int i = 0;
        while (true) {
            bpe[] bpeArr = (bpe[]) this.c;
            if (i < bpeArr.length) {
                pse.a();
                pse.b();
                bpe B = i75.B(pse.e, 3);
                xu5 xu5 = (xu5) ((List) this.b).get(i);
                String str = xu5.n;
                oyb.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                String str2 = xu5.a;
                if (str2 == null) {
                    pse.b();
                    str2 = pse.f;
                }
                uu5 uu5 = new uu5();
                uu5.a = str2;
                uu5.m = c49.l(str);
                uu5.e = xu5.e;
                uu5.d = xu5.d;
                uu5.F = xu5.G;
                uu5.p = xu5.q;
                B.e(new xu5(uu5));
                bpeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public long k(int i) {
        boolean z = false;
        swb.e(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        swb.e(z);
        return jArr[i];
    }

    public void l(Task task) {
        f6g f6g = (f6g) this.b;
        vde vde = (vde) this.c;
        synchronized (f6g.f) {
            f6g.e.remove(vde);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void n(ik7 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x000c }
            r0.remove(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)
            return
        L_0x000a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        L_0x000c:
            r2 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4b.n(ik7):void");
    }

    public void o(r8f r8f) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new zbe(this, 14, r8f));
        }
    }

    public void onError(Throwable th) {
        ((zhd) this.b).onError(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = ((tw3[]) r2.b)[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List q(long r3) {
        /*
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.c
            long[] r1 = (long[]) r1
            int r3 = mze.f(r1, r3, r0)
            r4 = -1
            if (r3 == r4) goto L_0x001c
            java.lang.Object r2 = r2.b
            tw3[] r2 = (tw3[]) r2
            r2 = r2[r3]
            tw3 r3 = tw3.G0
            if (r2 != r3) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L_0x001c:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4b.q(long):java.util.List");
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT:
                String str = (String) this.b;
                int e = me4.e(2, str);
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(me4.e(e, str2));
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((long[]) this.c).length;
    }

    public v4b(i6g i6g, lt4 lt4, int i) {
        this.a = 16;
        this.c = i6g;
        this.b = lt4;
    }

    public v4b(int i) {
        this.a = i;
        switch (i) {
            case 3:
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                this.b = new ija();
                this.c = new fqf();
                return;
            default:
                this.b = new r7e(l8.x0);
                this.c = new r7e(l8.w0);
                return;
        }
    }

    public v4b(Context context) {
        c33 c33;
        this.a = 9;
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            c33 = c33.a;
        } else if (i != 32) {
            c33 = c33.c;
        } else {
            c33 = c33.b;
        }
        grd a2 = hrd.a(c33);
        this.b = a2;
        this.c = new t0c(a2);
        context.registerComponentCallbacks(new ga2(2, this));
    }

    public v4b(Executor executor) {
        this.a = 10;
        this.b = executor;
        this.c = new ArrayDeque();
    }

    public v4b(List list) {
        this.a = 4;
        this.b = list;
        this.c = new bpe[list.size()];
    }

    public v4b(mhd mhd, zhd zhd) {
        this.a = 6;
        this.c = mhd;
        this.b = zhd;
    }

    public v4b(bke bke) {
        this.a = 1;
        this.b = bke;
        this.c = new yze(3, false);
    }

    public v4b(le4 le4) {
        this.a = 7;
        this.c = le4;
        this.b = new uq7();
    }

    public v4b(mse mse) {
        this.a = 11;
        this.c = mse;
        this.b = new wx1(new byte[4], 4, 2, (byte) 0);
    }
}
