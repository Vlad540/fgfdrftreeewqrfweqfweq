package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: r0c  reason: default package */
public final class r0c extends jja {
    public static final int c1 = g67.ALLOW_TRAILING_COMMA.b;
    public static final int d1 = g67.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int e1 = g67.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int f1 = g67.ALLOW_MISSING_VALUES.b;
    public static final int g1 = g67.ALLOW_SINGLE_QUOTES.b;
    public static final int h1 = g67.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int i1 = g67.ALLOW_COMMENTS.b;
    public static final int j1 = g67.ALLOW_YAML_COMMENTS.b;
    public static final int[] k1 = a22.c;
    public Reader W0;
    public char[] X0;
    public final boolean Y0;
    public final d22 Z0;
    public final int a1;
    public boolean b1;

    public r0c(tn6 tn6, int i, d22 d22, char[] cArr, int i2, int i3, boolean z) {
        super(tn6, i);
        this.W0 = null;
        this.X0 = cArr;
        this.X = i2;
        this.Y = i3;
        this.Z0 = d22;
        this.a1 = d22.c;
        this.Y0 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[LOOP:0: B:11:0x0039->B:14:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0() {
        /*
            r7 = this;
            super.D0()
            d22 r0 = r7.Z0
            boolean r1 = r0.l
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x000c
            goto L_0x0048
        L_0x000c:
            d22 r1 = r0.a
            if (r1 == 0) goto L_0x0048
            boolean r3 = r0.e
            if (r3 == 0) goto L_0x0048
            c22 r3 = new c22
            r3.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r1.b
            java.lang.Object r4 = r1.get()
            c22 r4 = (defpackage.c22) r4
            int r5 = r4.a
            int r6 = r3.a
            if (r6 != r5) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            r5 = 12000(0x2ee0, float:1.6816E-41)
            if (r6 <= r5) goto L_0x0039
            c22 r3 = new c22
            r5 = 64
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = 32
            b22[] r6 = new defpackage.b22[r6]
            r3.<init>(r5, r6)
        L_0x0039:
            boolean r5 = r1.compareAndSet(r4, r3)
            if (r5 == 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            java.lang.Object r5 = r1.get()
            if (r5 == r4) goto L_0x0039
        L_0x0046:
            r0.l = r2
        L_0x0048:
            boolean r0 = r7.Y0
            if (r0 == 0) goto L_0x0070
            char[] r0 = r7.X0
            if (r0 == 0) goto L_0x0070
            r1 = 0
            r7.X0 = r1
            tn6 r7 = r7.c
            char[] r2 = r7.f
            if (r0 == r2) goto L_0x0066
            int r3 = r0.length
            int r2 = r2.length
            if (r3 < r2) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Trying to release buffer smaller than original"
            r7.<init>(r0)
            throw r7
        L_0x0066:
            r7.f = r1
            hs0 r7 = r7.d
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r7.b
            r1 = 0
            r7.set(r1, r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0c.D0():void");
    }

    public final void S0(int i) {
        if (i == 93) {
            int i2 = this.X;
            this.y0 = this.w0;
            this.z0 = i2 - this.x0;
            if (this.A0.b()) {
                this.A0 = this.A0.c;
                this.b = q67.END_ARRAY;
            } else {
                H0('}', i);
                throw null;
            }
        }
        if (i == 125) {
            int i3 = this.X;
            this.y0 = this.w0;
            this.z0 = i3 - this.x0;
            if (this.A0.c()) {
                this.A0 = this.A0.c;
                this.b = q67.END_OBJECT;
                return;
            }
            H0(']', i);
            throw null;
        }
    }

    public final char T0() {
        if (this.X < this.Y || X0()) {
            char[] cArr = this.X0;
            int i = this.X;
            this.X = i + 1;
            char c = cArr[i];
            if (c == '\"' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                z0(c);
                return c;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.X < this.Y || X0()) {
                    char[] cArr2 = this.X0;
                    int i4 = this.X;
                    this.X = i4 + 1;
                    char c2 = cArr2[i4];
                    int i5 = a22.i[c2 & 255];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        I0(c2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    q67 q67 = q67.NOT_AVAILABLE;
                    F0(" in character escape sequence");
                    throw null;
                }
            }
            return (char) i3;
        }
        q67 q672 = q67.NOT_AVAILABLE;
        F0(" in character escape sequence");
        throw null;
    }

    public final void U0() {
        int i = this.X;
        int i2 = this.Y;
        int[] iArr = k1;
        bfe bfe = this.C0;
        if (i < i2) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.X0;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    int i3 = this.X;
                    bfe.s(cArr, i3, i - i3);
                    this.X = i + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.X0;
        int i4 = this.X;
        int i5 = i - i4;
        bfe.i = null;
        bfe.d = -1;
        bfe.e = 0;
        bfe.c = null;
        bfe.k = null;
        if (bfe.b) {
            bfe.c();
        } else if (((char[]) bfe.j) == null) {
            bfe.j = bfe.a(i5);
        }
        bfe.f = 0;
        bfe.g = 0;
        if (bfe.d >= 0) {
            bfe.u(i5);
        }
        bfe.c = null;
        bfe.k = null;
        char[] cArr3 = (char[]) bfe.j;
        int length2 = cArr3.length;
        int i6 = bfe.g;
        int i7 = length2 - i6;
        if (i7 >= i5) {
            System.arraycopy(cArr2, i4, cArr3, i6, i5);
            bfe.g += i5;
        } else {
            if (i7 > 0) {
                System.arraycopy(cArr2, i4, cArr3, i6, i7);
                i4 += i7;
                i5 -= i7;
            }
            do {
                bfe.i();
                int min = Math.min(((char[]) bfe.j).length, i5);
                System.arraycopy(cArr2, i4, (char[]) bfe.j, 0, min);
                bfe.g += min;
                i4 += min;
                i5 -= min;
            } while (i5 > 0);
        }
        this.X = i;
        char[] k = bfe.k();
        int i8 = bfe.g;
        int length3 = iArr.length;
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr4 = this.X0;
                int i9 = this.X;
                this.X = i9 + 1;
                char c2 = cArr4[i9];
                if (c2 < length3 && iArr[c2] != 0) {
                    if (c2 == '\"') {
                        bfe.g = i8;
                        return;
                    } else if (c2 == '\\') {
                        c2 = T0();
                    } else if (c2 < ' ') {
                        K0(c2, "string value");
                    }
                }
                if (i8 >= k.length) {
                    k = bfe.j();
                    i8 = 0;
                }
                k[i8] = c2;
                i8++;
            } else {
                q67 q67 = q67.NOT_AVAILABLE;
                F0(": was expecting closing quote for a string value");
                throw null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ?, r12v1 ?, r12v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final defpackage.q67 V0(
/*
Method generation error in method: r0c.V0(int, boolean):q67, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r10 != 44) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r9.A0.b() == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.q67 W0(int r10) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r9.a
            r2 = 0
            r3 = 0
            r4 = 39
            if (r10 == r4) goto L_0x008d
            r4 = 73
            int r5 = e1
            if (r10 == r4) goto L_0x0077
            r4 = 78
            if (r10 == r4) goto L_0x0061
            r4 = 93
            if (r10 == r4) goto L_0x0042
            r4 = 43
            if (r10 == r4) goto L_0x0021
            r3 = 44
            if (r10 == r3) goto L_0x004c
            goto L_0x00e4
        L_0x0021:
            int r10 = r9.X
            int r1 = r9.Y
            if (r10 < r1) goto L_0x0034
            boolean r10 = r9.X0()
            if (r10 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            q67 r10 = defpackage.q67.VALUE_NUMBER_INT
            r9.G0(r10)
            throw r2
        L_0x0034:
            char[] r10 = r9.X0
            int r1 = r9.X
            int r0 = r0 + r1
            r9.X = r0
            char r10 = r10[r1]
            q67 r9 = r9.V0(r10, r3)
            return r9
        L_0x0042:
            k67 r3 = r9.A0
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x004c
            goto L_0x00e4
        L_0x004c:
            k67 r3 = r9.A0
            boolean r3 = r3.d()
            if (r3 != 0) goto L_0x00e4
            int r3 = f1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00e4
            int r10 = r9.X
            int r10 = r10 - r0
            r9.X = r10
            q67 r9 = defpackage.q67.VALUE_NULL
            return r9
        L_0x0061:
            java.lang.String r10 = "NaN"
            r9.Y0(r0, r10)
            r0 = r1 & r5
            if (r0 == 0) goto L_0x0071
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            q67 r9 = r9.Q0(r10, r0)
            return r9
        L_0x0071:
            java.lang.String r10 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r9.E0(r10)
            throw r2
        L_0x0077:
            java.lang.String r10 = "Infinity"
            r9.Y0(r0, r10)
            r0 = r1 & r5
            if (r0 == 0) goto L_0x0087
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            q67 r9 = r9.Q0(r10, r0)
            return r9
        L_0x0087:
            java.lang.String r10 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r9.E0(r10)
            throw r2
        L_0x008d:
            int r5 = g1
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00e4
            bfe r1 = r9.C0
            char[] r10 = r1.h()
            int r5 = r1.g
        L_0x009a:
            int r6 = r9.X
            int r7 = r9.Y
            if (r6 < r7) goto L_0x00af
            boolean r6 = r9.X0()
            if (r6 == 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            q67 r10 = defpackage.q67.NOT_AVAILABLE
            java.lang.String r10 = ": was expecting closing quote for a string value"
            r9.F0(r10)
            throw r2
        L_0x00af:
            char[] r6 = r9.X0
            int r7 = r9.X
            int r8 = r7 + 1
            r9.X = r8
            char r6 = r6[r7]
            r7 = 92
            if (r6 > r7) goto L_0x00d6
            if (r6 != r7) goto L_0x00c4
            char r6 = r9.T0()
            goto L_0x00d6
        L_0x00c4:
            if (r6 > r4) goto L_0x00d6
            if (r6 != r4) goto L_0x00cd
            r1.g = r5
            q67 r9 = defpackage.q67.VALUE_STRING
            return r9
        L_0x00cd:
            r7 = 32
            if (r6 >= r7) goto L_0x00d6
            java.lang.String r7 = "string value"
            r9.K0(r6, r7)
        L_0x00d6:
            int r7 = r10.length
            if (r5 < r7) goto L_0x00de
            char[] r10 = r1.j()
            r5 = r3
        L_0x00de:
            int r7 = r5 + 1
            r10[r5] = r6
            r5 = r7
            goto L_0x009a
        L_0x00e4:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r10)
            if (r0 == 0) goto L_0x0101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r10 = (char) r10
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = r9.L0()
            r9.c1(r10, r0)
            throw r2
        L_0x0101:
            java.lang.String r0 = r9.L0()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r9.I0(r10, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0c.W0(int):q67");
    }

    public final boolean X0() {
        Reader reader = this.W0;
        if (reader != null) {
            char[] cArr = this.X0;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = this.Y;
                this.Z += (long) i;
                this.x0 -= i;
                this.X = 0;
                this.Y = read;
                return true;
            }
            v0();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.Y);
            }
        }
        return false;
    }

    public final void Y0(int i, String str) {
        int i2;
        char c;
        int length = str.length();
        if (this.X + length >= this.Y) {
            int length2 = str.length();
            do {
                if ((this.X < this.Y || X0()) && this.X0[this.X] == str.charAt(i)) {
                    i2 = this.X + 1;
                    this.X = i2;
                    i++;
                } else {
                    c1(str.substring(0, i), L0());
                    throw null;
                }
            } while (i < length2);
            if ((i2 < this.Y || X0()) && (c = this.X0[this.X]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart((char) c)) {
                c1(str.substring(0, i), L0());
                throw null;
            }
            return;
        }
        while (this.X0[this.X] == str.charAt(i)) {
            int i3 = this.X + 1;
            this.X = i3;
            i++;
            if (i >= length) {
                char c2 = this.X0[i3];
                if (c2 >= '0' && c2 != ']' && c2 != '}' && Character.isJavaIdentifierPart((char) c2)) {
                    c1(str.substring(0, i), L0());
                    throw null;
                }
                return;
            }
        }
        c1(str.substring(0, i), L0());
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r10 == 'E') goto L_0x0036;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.q67 Z0(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r0 = r8.Y
            r1 = 0
            r2 = 46
            r3 = 57
            r4 = 48
            r5 = 0
            if (r10 != r2) goto L_0x002e
            r10 = r5
        L_0x000d:
            if (r12 < r0) goto L_0x0014
            q67 r8 = r8.b1(r11, r9)
            return r8
        L_0x0014:
            char[] r2 = r8.X0
            int r6 = r12 + 1
            char r12 = r2[r12]
            if (r12 < r4) goto L_0x0023
            if (r12 <= r3) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r10 = r10 + 1
            r12 = r6
            goto L_0x000d
        L_0x0023:
            if (r10 == 0) goto L_0x0028
            r10 = r12
            r12 = r6
            goto L_0x002e
        L_0x0028:
            java.lang.String r9 = "Decimal point not followed by a digit"
            r8.P0(r12, r9)
            throw r1
        L_0x002e:
            r2 = 101(0x65, float:1.42E-43)
            if (r10 == r2) goto L_0x0036
            r2 = 69
            if (r10 != r2) goto L_0x0079
        L_0x0036:
            if (r12 < r0) goto L_0x003f
            r8.X = r11
            q67 r8 = r8.b1(r11, r9)
            return r8
        L_0x003f:
            char[] r10 = r8.X0
            int r2 = r12 + 1
            char r6 = r10[r12]
            r7 = 45
            if (r6 == r7) goto L_0x0052
            r7 = 43
            if (r6 != r7) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r12 = r2
            r2 = r5
            r10 = r6
            goto L_0x0060
        L_0x0052:
            if (r2 < r0) goto L_0x005b
            r8.X = r11
            q67 r8 = r8.b1(r11, r9)
            return r8
        L_0x005b:
            int r12 = r12 + 2
            char r10 = r10[r2]
            r2 = r5
        L_0x0060:
            if (r10 > r3) goto L_0x0077
            if (r10 < r4) goto L_0x0077
            int r2 = r2 + 1
            if (r12 < r0) goto L_0x006f
            r8.X = r11
            q67 r8 = r8.b1(r11, r9)
            return r8
        L_0x006f:
            char[] r10 = r8.X0
            int r6 = r12 + 1
            char r10 = r10[r12]
            r12 = r6
            goto L_0x0060
        L_0x0077:
            if (r2 == 0) goto L_0x0099
        L_0x0079:
            int r12 = r12 + -1
            r8.X = r12
            k67 r0 = r8.A0
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0088
            r8.j1(r10)
        L_0x0088:
            int r12 = r12 - r11
            bfe r10 = r8.C0
            char[] r0 = r8.X0
            r10.s(r0, r11, r12)
            r8.L0 = r9
            r8.M0 = r13
            r8.F0 = r5
            q67 r8 = defpackage.q67.VALUE_NUMBER_FLOAT
            return r8
        L_0x0099:
            java.lang.String r9 = "Exponent indicator not followed by a digit"
            r8.P0(r10, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0c.Z0(boolean, int, int, int, int):q67");
    }

    public final String a1(int i, int i2, int i3) {
        bfe bfe = this.C0;
        bfe.s(this.X0, i, this.X - i);
        char[] k = bfe.k();
        int i4 = bfe.g;
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr = this.X0;
                int i5 = this.X;
                this.X = i5 + 1;
                char c = cArr[i5];
                int i6 = 0;
                if (c <= '\\') {
                    if (c == '\\') {
                        c = T0();
                    } else if (c <= i3) {
                        if (c == i3) {
                            bfe.g = i4;
                            char[] m = bfe.m();
                            int i7 = bfe.d;
                            if (i7 >= 0) {
                                i6 = i7;
                            }
                            return this.Z0.c(m, i6, bfe.t(), i2);
                        } else if (c < ' ') {
                            K0(c, "name");
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                int i8 = i4 + 1;
                k[i4] = c;
                if (i8 >= k.length) {
                    k = bfe.j();
                    i4 = 0;
                } else {
                    i4 = i8;
                }
            } else {
                q67 q67 = q67.NOT_AVAILABLE;
                F0(" in field name");
                throw null;
            }
        }
    }

    public final q67 b1(int i, boolean z) {
        int i2;
        char c;
        boolean z2;
        int i3;
        int i4;
        char c2;
        char c3;
        char c4;
        int i5;
        int i6;
        char c5;
        boolean z3 = z;
        this.X = z3 ? i + 1 : i;
        bfe bfe = this.C0;
        char[] h = bfe.h();
        if (z3) {
            h[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = this.X;
        if (i7 < this.Y) {
            char[] cArr = this.X0;
            this.X = i7 + 1;
            c = cArr[i7];
        } else {
            q67 q67 = q67.NOT_AVAILABLE;
            c = k1("No digit following minus sign");
        }
        if (c == '0') {
            int i8 = this.X;
            int i9 = this.Y;
            if ((i8 >= i9 || ((c5 = this.X0[i8]) >= '0' && c5 <= '9')) && ((i8 < i9 || X0()) && (c = this.X0[i6]) >= '0' && c <= '9')) {
                if ((this.a & d1) != 0) {
                    (i6 = this.X)++;
                    if (c == '0') {
                        while (true) {
                            if (this.X >= this.Y && !X0()) {
                                break;
                            }
                            char[] cArr2 = this.X0;
                            int i10 = this.X;
                            c = cArr2[i10];
                            if (c < '0' || c > '9') {
                                break;
                            }
                            this.X = i10 + 1;
                            if (c != '0') {
                                break;
                            }
                        }
                    }
                } else {
                    E0("Invalid numeric value: Leading zeroes not allowed");
                    throw null;
                }
            }
            c = '0';
        }
        int i11 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i11++;
                if (i2 >= h.length) {
                    h = bfe.j();
                    i2 = 0;
                }
                int i12 = i2 + 1;
                h[i2] = c;
                if (this.X >= this.Y && !X0()) {
                    c = 0;
                    i2 = i12;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.X0;
                int i13 = this.X;
                this.X = i13 + 1;
                c = cArr3[i13];
                i2 = i12;
            } else {
                z2 = false;
            }
        }
        if (i11 == 0) {
            return V0(c, z3);
        }
        if (c == '.') {
            if (i2 >= h.length) {
                h = bfe.j();
                i2 = 0;
            }
            h[i2] = c;
            int i14 = i2 + 1;
            i3 = 0;
            while (true) {
                if (this.X >= this.Y && !X0()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.X0;
                int i15 = this.X;
                this.X = i15 + 1;
                c = cArr4[i15];
                if (c < '0' || c > '9') {
                    break;
                }
                i3++;
                if (i2 >= h.length) {
                    h = bfe.j();
                    i2 = 0;
                }
                h[i2] = c;
                i14 = i2 + 1;
            }
            if (i3 == 0) {
                P0(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i3 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i2 >= h.length) {
                h = bfe.j();
                i2 = 0;
            }
            int i16 = i2 + 1;
            h[i2] = c;
            int i17 = this.X;
            if (i17 < this.Y) {
                char[] cArr5 = this.X0;
                this.X = i17 + 1;
                c2 = cArr5[i17];
            } else {
                c2 = k1("expected a digit for number exponent");
            }
            if (c2 == '-' || c2 == '+') {
                if (i16 >= h.length) {
                    h = bfe.j();
                    i16 = 0;
                }
                int i18 = i16 + 1;
                h[i16] = c2;
                int i19 = this.X;
                if (i19 < this.Y) {
                    char[] cArr6 = this.X0;
                    this.X = i19 + 1;
                    c3 = cArr6[i19];
                } else {
                    c3 = k1("expected a digit for number exponent");
                }
                c4 = c3;
                i16 = i18;
            } else {
                c4 = c2;
            }
            i4 = 0;
            while (true) {
                if (c <= '9' && c >= '0') {
                    i4++;
                    if (i16 >= h.length) {
                        h = bfe.j();
                        i16 = 0;
                    }
                    i5 = i16 + 1;
                    h[i16] = c;
                    if (this.X >= this.Y && !X0()) {
                        z2 = true;
                        break;
                    }
                    char[] cArr7 = this.X0;
                    int i20 = this.X;
                    this.X = i20 + 1;
                    c4 = cArr7[i20];
                    i16 = i5;
                } else {
                    i5 = i16;
                }
            }
            i5 = i16;
            if (i4 == 0) {
                P0(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        } else {
            i4 = 0;
        }
        if (!z2) {
            this.X--;
            if (this.A0.d()) {
                j1(c);
            }
        }
        bfe.g = i2;
        if (i3 < 1 && i4 < 1) {
            return R0(i11, z3);
        }
        this.L0 = z3;
        this.M0 = i11;
        this.F0 = 0;
        return q67.VALUE_NUMBER_FLOAT;
    }

    public final void c1(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.X >= this.Y && !X0()) {
                break;
            }
            char c = this.X0[this.X];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.X++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new StreamReadException(this, "Unrecognized token '" + sb + "': was expecting " + str2);
    }

    public final int d1() {
        char c;
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr = this.X0;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        g1();
                    } else if (c != '#' || (this.a & j1) == 0) {
                        return c;
                    } else {
                        h1();
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (c == 13) {
                    e1();
                } else if (c != 9) {
                    J0(c);
                    throw null;
                }
            } else {
                throw new StreamReadException(this, "Unexpected end-of-input within/between " + this.A0.e() + " entries");
            }
        }
        return c;
    }

    public final void e1() {
        if (this.X < this.Y || X0()) {
            char[] cArr = this.X0;
            int i = this.X;
            if (cArr[i] == 10) {
                this.X = i + 1;
            }
        }
        this.w0++;
        this.x0 = this.X;
    }

    public final int f1(boolean z) {
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr = this.X0;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        g1();
                    } else if (c == '#' && (this.a & j1) != 0) {
                        h1();
                    } else if (z) {
                        return c;
                    } else {
                        if (c == ':') {
                            z = true;
                        } else {
                            I0(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (c == 13) {
                    e1();
                } else if (c != 9) {
                    J0(c);
                    throw null;
                }
            } else {
                F0(" within/between " + this.A0.e() + " entries");
                throw null;
            }
        }
    }

    public final void g1() {
        if ((this.a & i1) == 0) {
            I0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.X < this.Y || X0()) {
            char[] cArr = this.X0;
            int i = this.X;
            this.X = i + 1;
            char c = cArr[i];
            if (c == '/') {
                h1();
            } else if (c == '*') {
                while (true) {
                    if (this.X >= this.Y && !X0()) {
                        break;
                    }
                    char[] cArr2 = this.X0;
                    int i2 = this.X;
                    int i3 = i2 + 1;
                    this.X = i3;
                    char c2 = cArr2[i2];
                    if (c2 <= '*') {
                        if (c2 == '*') {
                            if (i3 >= this.Y && !X0()) {
                                break;
                            }
                            char[] cArr3 = this.X0;
                            int i4 = this.X;
                            if (cArr3[i4] == '/') {
                                this.X = i4 + 1;
                                return;
                            }
                        } else if (c2 >= ' ') {
                            continue;
                        } else if (c2 == 10) {
                            this.w0++;
                            this.x0 = i3;
                        } else if (c2 == 13) {
                            e1();
                        } else if (c2 != 9) {
                            J0(c2);
                            throw null;
                        }
                    }
                }
                F0(" in a comment");
                throw null;
            } else {
                I0(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            F0(" in a comment");
            throw null;
        }
    }

    public final void h1() {
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr = this.X0;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this.w0++;
                        this.x0 = i2;
                        return;
                    } else if (c == 13) {
                        e1();
                        return;
                    } else if (c != 9) {
                        J0(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final int i1() {
        char c;
        while (true) {
            if (this.X < this.Y || X0()) {
                char[] cArr = this.X0;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        g1();
                    } else if (c != '#' || (this.a & j1) == 0) {
                        return c;
                    } else {
                        h1();
                    }
                } else if (c == ' ') {
                    continue;
                } else if (c == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (c == 13) {
                    e1();
                } else if (c != 9) {
                    J0(c);
                    throw null;
                }
            } else {
                y0();
                return -1;
            }
        }
        return c;
    }

    public final void j1(int i) {
        int i2 = this.X + 1;
        this.X = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.w0++;
            this.x0 = i2;
        } else if (i == 13) {
            e1();
        } else if (i != 32) {
            I0(i, "Expected space separating root-level values");
            throw null;
        }
    }

    public final char k1(String str) {
        if (this.X < this.Y || X0()) {
            char[] cArr = this.X0;
            int i = this.X;
            this.X = i + 1;
            return cArr[i];
        }
        F0(str);
        throw null;
    }

    public final e67 o() {
        Object x0 = x0();
        return new e67(this.w0, (this.X - this.x0) + 1, -1, this.Z + ((long) this.X), x0);
    }

    public final String q0() {
        q67 q67 = this.b;
        q67 q672 = q67.VALUE_STRING;
        bfe bfe = this.C0;
        if (q67 == q672) {
            if (this.b1) {
                this.b1 = false;
                U0();
            }
            return bfe.g();
        } else if (q67 == null) {
            return null;
        } else {
            int i = q67.o;
            return i != 5 ? (i == 6 || i == 7 || i == 8) ? bfe.g() : q67.a : this.A0.f;
        }
    }

    public final char[] r0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return null;
        }
        int i = q67.o;
        if (i != 5) {
            if (i != 6) {
                if (!(i == 7 || i == 8)) {
                    return q67.b;
                }
            } else if (this.b1) {
                this.b1 = false;
                U0();
            }
            return this.C0.m();
        }
        if (!this.E0) {
            String str = this.A0.f;
            int length = str.length();
            char[] cArr = this.D0;
            if (cArr == null) {
                tn6 tn6 = this.c;
                if (tn6.h == null) {
                    char[] a = tn6.d.a(3, length);
                    tn6.h = a;
                    this.D0 = a;
                } else {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
            } else if (cArr.length < length) {
                this.D0 = new char[length];
            }
            str.getChars(0, length, this.D0, 0);
            this.E0 = true;
        }
        return this.D0;
    }

    public final int s0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return 0;
        }
        int i = q67.o;
        if (i == 5) {
            return this.A0.f.length();
        }
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return q67.b.length;
            }
        } else if (this.b1) {
            this.b1 = false;
            U0();
        }
        return this.C0.t();
    }

    public final int t0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return 0;
        }
        int i = q67.o;
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return 0;
            }
        } else if (this.b1) {
            this.b1 = false;
            U0();
        }
        int i2 = this.C0.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v79, types: [char[]] */
    /* JADX WARNING: type inference failed for: r1v80, types: [char, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d7, code lost:
        r1 = r6.X;
        r6.X = r9;
        r1 = a1(r1, r13, 34);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r1v80, types: [char, int] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x02a3 A[EDGE_INSN: B:399:0x02a3->B:171:0x02a3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.q67 u0() {
        /*
            r16 = this;
            r6 = r16
            r0 = 1
            q67 r1 = r6.b
            q67 r2 = defpackage.q67.FIELD_NAME
            r3 = 0
            r4 = 0
            if (r1 != r2) goto L_0x0035
            r6.E0 = r3
            q67 r0 = r6.B0
            r6.B0 = r4
            q67 r1 = defpackage.q67.START_ARRAY
            if (r0 != r1) goto L_0x0022
            k67 r1 = r6.A0
            int r2 = r6.y0
            int r3 = r6.z0
            k67 r1 = r1.f(r2, r3)
            r6.A0 = r1
            goto L_0x0032
        L_0x0022:
            q67 r1 = defpackage.q67.START_OBJECT
            if (r0 != r1) goto L_0x0032
            k67 r1 = r6.A0
            int r2 = r6.y0
            int r3 = r6.z0
            k67 r1 = r1.g(r2, r3)
            r6.A0 = r1
        L_0x0032:
            r6.b = r0
            return r0
        L_0x0035:
            r6.F0 = r3
            boolean r1 = r6.b1
            r2 = 32
            r5 = 34
            if (r1 == 0) goto L_0x0084
            r6.b1 = r3
            int r1 = r6.X
            int r7 = r6.Y
            char[] r8 = r6.X0
        L_0x0047:
            if (r1 < r7) goto L_0x005e
            r6.X = r1
            boolean r1 = r16.X0()
            if (r1 == 0) goto L_0x0056
            int r1 = r6.X
            int r7 = r6.Y
            goto L_0x005e
        L_0x0056:
            q67 r0 = defpackage.q67.NOT_AVAILABLE
            java.lang.String r0 = ": was expecting closing quote for a string value"
            r6.F0(r0)
            throw r4
        L_0x005e:
            int r9 = r1 + 1
            char r1 = r8[r1]
            r10 = 92
            if (r1 > r10) goto L_0x0082
            if (r1 != r10) goto L_0x0072
            r6.X = r9
            r16.T0()
            int r1 = r6.X
            int r7 = r6.Y
            goto L_0x0047
        L_0x0072:
            if (r1 > r5) goto L_0x0082
            if (r1 != r5) goto L_0x0079
            r6.X = r9
            goto L_0x0084
        L_0x0079:
            if (r1 >= r2) goto L_0x0082
            r6.X = r9
            java.lang.String r10 = "string value"
            r6.K0(r1, r10)
        L_0x0082:
            r1 = r9
            goto L_0x0047
        L_0x0084:
            int r1 = r6.X
            int r7 = r6.Y
            r8 = 10
            r9 = 13
            r10 = 9
            r11 = 47
            r12 = 35
            if (r1 < r7) goto L_0x00a0
            boolean r1 = r16.X0()
            if (r1 != 0) goto L_0x00a0
            r16.y0()
            r1 = -1
            goto L_0x010b
        L_0x00a0:
            char[] r1 = r6.X0
            int r7 = r6.X
            int r13 = r7 + 1
            r6.X = r13
            char r1 = r1[r7]
            if (r1 <= r2) goto L_0x00b7
            if (r1 == r11) goto L_0x00b0
            if (r1 != r12) goto L_0x010b
        L_0x00b0:
            r6.X = r7
            int r1 = r16.i1()
            goto L_0x010b
        L_0x00b7:
            if (r1 == r2) goto L_0x00d0
            if (r1 != r8) goto L_0x00c3
            int r1 = r6.w0
            int r1 = r1 + r0
            r6.w0 = r1
            r6.x0 = r13
            goto L_0x00d0
        L_0x00c3:
            if (r1 != r9) goto L_0x00c9
            r16.e1()
            goto L_0x00d0
        L_0x00c9:
            if (r1 != r10) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            r6.J0(r1)
            throw r4
        L_0x00d0:
            int r1 = r6.X
            int r7 = r6.Y
            if (r1 >= r7) goto L_0x0107
            char[] r7 = r6.X0
            int r13 = r1 + 1
            r6.X = r13
            char r7 = r7[r1]
            if (r7 <= r2) goto L_0x00ee
            if (r7 == r11) goto L_0x00e7
            if (r7 != r12) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r1 = r7
            goto L_0x010b
        L_0x00e7:
            r6.X = r1
            int r1 = r16.i1()
            goto L_0x010b
        L_0x00ee:
            if (r7 == r2) goto L_0x00d0
            if (r7 != r8) goto L_0x00fa
            int r1 = r6.w0
            int r1 = r1 + r0
            r6.w0 = r1
            r6.x0 = r13
            goto L_0x00d0
        L_0x00fa:
            if (r7 != r9) goto L_0x0100
            r16.e1()
            goto L_0x00d0
        L_0x0100:
            if (r7 != r10) goto L_0x0103
            goto L_0x00d0
        L_0x0103:
            r6.J0(r7)
            throw r4
        L_0x0107:
            int r1 = r16.i1()
        L_0x010b:
            if (r1 >= 0) goto L_0x0113
            r16.close()
            r6.b = r4
            return r4
        L_0x0113:
            r7 = 93
            if (r1 == r7) goto L_0x0589
            r13 = 125(0x7d, float:1.75E-43)
            if (r1 != r13) goto L_0x011d
            goto L_0x0589
        L_0x011d:
            k67 r14 = r6.A0
            int r15 = r14.b
            int r15 = r15 + r0
            r14.b = r15
            int r14 = r14.a
            if (r14 == 0) goto L_0x012c
            if (r15 <= 0) goto L_0x012c
            r14 = r0
            goto L_0x012d
        L_0x012c:
            r14 = r3
        L_0x012d:
            int r15 = r6.a
            if (r14 == 0) goto L_0x019d
            r14 = 44
            if (r1 != r14) goto L_0x0180
        L_0x0135:
            int r1 = r6.X
            int r14 = r6.Y
            if (r1 >= r14) goto L_0x016d
            char[] r14 = r6.X0
            int r3 = r1 + 1
            r6.X = r3
            char r14 = r14[r1]
            if (r14 <= r2) goto L_0x0153
            if (r14 == r11) goto L_0x014c
            if (r14 != r12) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r1 = r14
            goto L_0x0171
        L_0x014c:
            r6.X = r1
            int r1 = r16.d1()
            goto L_0x0171
        L_0x0153:
            if (r14 >= r2) goto L_0x015e
            if (r14 != r8) goto L_0x0160
            int r1 = r6.w0
            int r1 = r1 + r0
            r6.w0 = r1
            r6.x0 = r3
        L_0x015e:
            r3 = 0
            goto L_0x0135
        L_0x0160:
            if (r14 != r9) goto L_0x0166
            r16.e1()
            goto L_0x015e
        L_0x0166:
            if (r14 != r10) goto L_0x0169
            goto L_0x015e
        L_0x0169:
            r6.J0(r14)
            throw r4
        L_0x016d:
            int r1 = r16.d1()
        L_0x0171:
            int r3 = c1
            r3 = r3 & r15
            if (r3 == 0) goto L_0x019d
            if (r1 == r7) goto L_0x017a
            if (r1 != r13) goto L_0x019d
        L_0x017a:
            r6.S0(r1)
            q67 r0 = r6.b
            return r0
        L_0x0180:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "was expecting comma to separate "
            r0.<init>(r2)
            k67 r2 = r6.A0
            java.lang.String r2 = r2.e()
            r0.append(r2)
            java.lang.String r2 = " entries"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.I0(r1, r0)
            throw r4
        L_0x019d:
            k67 r3 = r6.A0
            boolean r8 = r3.c()
            bfe r3 = r6.C0
            if (r8 == 0) goto L_0x0396
            int r9 = r6.X
            d22 r14 = r6.Z0
            int[] r7 = k1
            int r13 = r6.a1
            if (r1 != r5) goto L_0x01e1
        L_0x01b1:
            int r1 = r6.Y
            if (r9 >= r1) goto L_0x01d7
            char[] r1 = r6.X0
            char r4 = r1[r9]
            int r10 = r7.length
            if (r4 >= r10) goto L_0x01cf
            r10 = r7[r4]
            if (r10 == 0) goto L_0x01cf
            if (r4 != r5) goto L_0x01d7
            int r4 = r6.X
            int r7 = r9 + 1
            r6.X = r7
            int r9 = r9 - r4
            java.lang.String r1 = r14.c(r1, r4, r9, r13)
            goto L_0x02b7
        L_0x01cf:
            int r13 = r13 * 33
            int r13 = r13 + r4
            int r9 = r9 + r0
            r4 = 0
            r10 = 9
            goto L_0x01b1
        L_0x01d7:
            int r1 = r6.X
            r6.X = r9
            java.lang.String r1 = r6.a1(r1, r13, r5)
            goto L_0x02b7
        L_0x01e1:
            r4 = 39
            if (r1 != r4) goto L_0x021d
            int r10 = g1
            r10 = r10 & r15
            if (r10 == 0) goto L_0x021d
            int r1 = r6.Y
            if (r9 >= r1) goto L_0x0213
            int r10 = r7.length
        L_0x01ef:
            char[] r5 = r6.X0
            char r12 = r5[r9]
            if (r12 != r4) goto L_0x0202
            int r1 = r6.X
            int r4 = r9 + 1
            r6.X = r4
            int r9 = r9 - r1
            java.lang.String r1 = r14.c(r5, r1, r9, r13)
            goto L_0x02b7
        L_0x0202:
            if (r12 >= r10) goto L_0x0209
            r5 = r7[r12]
            if (r5 == 0) goto L_0x0209
            goto L_0x0213
        L_0x0209:
            int r13 = r13 * 33
            int r13 = r13 + r12
            int r9 = r9 + r0
            if (r9 < r1) goto L_0x0210
            goto L_0x0213
        L_0x0210:
            r12 = 35
            goto L_0x01ef
        L_0x0213:
            int r1 = r6.X
            r6.X = r9
            java.lang.String r1 = r6.a1(r1, r13, r4)
            goto L_0x02b7
        L_0x021d:
            int r4 = h1
            r4 = r4 & r15
            if (r4 == 0) goto L_0x038f
            int[] r4 = defpackage.a22.e
            int r5 = r4.length
            if (r1 >= r5) goto L_0x022f
            r7 = r4[r1]
            if (r7 != 0) goto L_0x022d
            r7 = r0
            goto L_0x0234
        L_0x022d:
            r7 = 0
            goto L_0x0234
        L_0x022f:
            char r7 = (char) r1
            boolean r7 = java.lang.Character.isJavaIdentifierPart(r7)
        L_0x0234:
            if (r7 == 0) goto L_0x0388
            int r1 = r6.X
            int r7 = r6.Y
            if (r1 >= r7) goto L_0x026b
        L_0x023c:
            char[] r9 = r6.X0
            char r10 = r9[r1]
            if (r10 >= r5) goto L_0x0251
            r12 = r4[r10]
            if (r12 == 0) goto L_0x0265
            int r4 = r6.X
            int r4 = r4 - r0
            r6.X = r1
            int r1 = r1 - r4
            java.lang.String r1 = r14.c(r9, r4, r1, r13)
            goto L_0x02b7
        L_0x0251:
            char r9 = (char) r10
            boolean r9 = java.lang.Character.isJavaIdentifierPart(r9)
            if (r9 != 0) goto L_0x0265
            int r4 = r6.X
            int r4 = r4 - r0
            r6.X = r1
            char[] r5 = r6.X0
            int r1 = r1 - r4
            java.lang.String r1 = r14.c(r5, r4, r1, r13)
            goto L_0x02b7
        L_0x0265:
            int r13 = r13 * 33
            int r13 = r13 + r10
            int r1 = r1 + r0
            if (r1 < r7) goto L_0x023c
        L_0x026b:
            int r5 = r6.X
            int r5 = r5 - r0
            r6.X = r1
            char[] r7 = r6.X0
            int r1 = r1 - r5
            r3.s(r7, r5, r1)
            char[] r1 = r3.k()
            int r5 = r3.g
            int r7 = r4.length
        L_0x027d:
            int r9 = r6.X
            int r10 = r6.Y
            if (r9 < r10) goto L_0x028a
            boolean r9 = r16.X0()
            if (r9 != 0) goto L_0x028a
            goto L_0x02a3
        L_0x028a:
            char[] r9 = r6.X0
            int r10 = r6.X
            char r9 = r9[r10]
            if (r9 >= r7) goto L_0x029d
            r10 = r4[r9]
            if (r10 == 0) goto L_0x0297
            goto L_0x02a3
        L_0x0297:
            r10 = 9
            r12 = 35
            goto L_0x036e
        L_0x029d:
            boolean r10 = java.lang.Character.isJavaIdentifierPart(r9)
            if (r10 != 0) goto L_0x0297
        L_0x02a3:
            r3.g = r5
            char[] r1 = r3.m()
            int r4 = r3.d
            if (r4 < 0) goto L_0x02ae
            goto L_0x02af
        L_0x02ae:
            r4 = 0
        L_0x02af:
            int r5 = r3.t()
            java.lang.String r1 = r14.c(r1, r4, r5, r13)
        L_0x02b7:
            k67 r4 = r6.A0
            r4.h(r1)
            q67 r1 = defpackage.q67.FIELD_NAME
            r6.b = r1
            int r1 = r6.X
            int r4 = r1 + 4
            int r5 = r6.Y
            if (r4 < r5) goto L_0x02cf
            r4 = 0
            int r1 = r6.f1(r4)
            goto L_0x0396
        L_0x02cf:
            char[] r4 = r6.X0
            char r5 = r4[r1]
            r7 = 58
            if (r5 != r7) goto L_0x031b
            int r5 = r1 + 1
            r6.X = r5
            char r5 = r4[r5]
            if (r5 <= r2) goto L_0x02f3
            if (r5 == r11) goto L_0x02ed
            r2 = 35
            if (r5 != r2) goto L_0x02e6
            goto L_0x02ed
        L_0x02e6:
            int r1 = r1 + 2
            r6.X = r1
        L_0x02ea:
            r1 = r5
            goto L_0x0396
        L_0x02ed:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x02f3:
            if (r5 == r2) goto L_0x02f9
            r7 = 9
            if (r5 != r7) goto L_0x0315
        L_0x02f9:
            int r5 = r1 + 2
            r6.X = r5
            char r4 = r4[r5]
            if (r4 <= r2) goto L_0x0315
            if (r4 == r11) goto L_0x030f
            r2 = 35
            if (r4 != r2) goto L_0x0308
            goto L_0x030f
        L_0x0308:
            int r1 = r1 + 3
            r6.X = r1
        L_0x030c:
            r1 = r4
            goto L_0x0396
        L_0x030f:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x0315:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x031b:
            if (r5 == r2) goto L_0x0321
            r9 = 9
            if (r5 != r9) goto L_0x0326
        L_0x0321:
            int r1 = r1 + r0
            r6.X = r1
            char r5 = r4[r1]
        L_0x0326:
            if (r5 != r7) goto L_0x0367
            int r1 = r6.X
            int r5 = r1 + 1
            r6.X = r5
            char r5 = r4[r5]
            if (r5 <= r2) goto L_0x0343
            if (r5 == r11) goto L_0x033e
            r2 = 35
            if (r5 != r2) goto L_0x0339
            goto L_0x033e
        L_0x0339:
            int r1 = r1 + 2
            r6.X = r1
            goto L_0x02ea
        L_0x033e:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x0343:
            if (r5 == r2) goto L_0x0349
            r10 = 9
            if (r5 != r10) goto L_0x0362
        L_0x0349:
            int r5 = r1 + 2
            r6.X = r5
            char r4 = r4[r5]
            if (r4 <= r2) goto L_0x0362
            if (r4 == r11) goto L_0x035d
            r12 = 35
            if (r4 != r12) goto L_0x0358
            goto L_0x035d
        L_0x0358:
            int r1 = r1 + 3
            r6.X = r1
            goto L_0x030c
        L_0x035d:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x0362:
            int r1 = r6.f1(r0)
            goto L_0x0396
        L_0x0367:
            r1 = 0
            int r2 = r6.f1(r1)
            r1 = r2
            goto L_0x0396
        L_0x036e:
            int r2 = r6.X
            int r2 = r2 + r0
            r6.X = r2
            int r13 = r13 * 33
            int r13 = r13 + r9
            int r2 = r5 + 1
            r1[r5] = r9
            int r5 = r1.length
            if (r2 < r5) goto L_0x0383
            char[] r1 = r3.j()
            r5 = 0
            goto L_0x0384
        L_0x0383:
            r5 = r2
        L_0x0384:
            r2 = 32
            goto L_0x027d
        L_0x0388:
            java.lang.String r0 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r6.I0(r1, r0)
            r0 = 0
            throw r0
        L_0x038f:
            r0 = 0
            java.lang.String r2 = "was expecting double-quote to start field name"
            r6.I0(r1, r2)
            throw r0
        L_0x0396:
            int r2 = r6.X
            int r4 = r6.w0
            r6.y0 = r4
            int r5 = r6.x0
            int r5 = r2 - r5
            r6.z0 = r5
            r7 = 34
            if (r1 == r7) goto L_0x057b
            r7 = 91
            if (r1 == r7) goto L_0x056e
            r7 = 108(0x6c, float:1.51E-43)
            r9 = 102(0x66, float:1.43E-43)
            r10 = 101(0x65, float:1.42E-43)
            r11 = 48
            if (r1 == r9) goto L_0x0535
            r9 = 110(0x6e, float:1.54E-43)
            r12 = 117(0x75, float:1.64E-43)
            if (r1 == r9) goto L_0x0506
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x04d4
            r7 = 123(0x7b, float:1.72E-43)
            if (r1 == r7) goto L_0x04c6
            r7 = 125(0x7d, float:1.75E-43)
            if (r1 == r7) goto L_0x04bf
            r4 = 69
            r5 = 57
            r7 = 45
            r9 = 46
            if (r1 == r7) goto L_0x0453
            if (r1 == r9) goto L_0x0433
            switch(r1) {
                case 48: goto L_0x03db;
                case 49: goto L_0x03db;
                case 50: goto L_0x03db;
                case 51: goto L_0x03db;
                case 52: goto L_0x03db;
                case 53: goto L_0x03db;
                case 54: goto L_0x03db;
                case 55: goto L_0x03db;
                case 56: goto L_0x03db;
                case 57: goto L_0x03db;
                default: goto L_0x03d5;
            }
        L_0x03d5:
            q67 r0 = r6.W0(r1)
            goto L_0x057f
        L_0x03db:
            int r7 = r2 + -1
            int r12 = r6.Y
            if (r1 != r11) goto L_0x03e8
            r1 = 0
            q67 r0 = r6.b1(r7, r1)
            goto L_0x057f
        L_0x03e8:
            r1 = 0
            r13 = r0
        L_0x03ea:
            if (r2 < r12) goto L_0x03f4
            r6.X = r7
            q67 r0 = r6.b1(r7, r1)
            goto L_0x057f
        L_0x03f4:
            char[] r1 = r6.X0
            int r14 = r2 + 1
            char r15 = r1[r2]
            if (r15 < r11) goto L_0x0403
            if (r15 <= r5) goto L_0x03ff
            goto L_0x0403
        L_0x03ff:
            int r13 = r13 + r0
            r2 = r14
            r1 = 0
            goto L_0x03ea
        L_0x0403:
            if (r15 == r9) goto L_0x0424
            if (r15 == r10) goto L_0x0424
            if (r15 != r4) goto L_0x040a
            goto L_0x0424
        L_0x040a:
            r6.X = r2
            k67 r0 = r6.A0
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0417
            r6.j1(r15)
        L_0x0417:
            int r2 = r2 - r7
            char[] r0 = r6.X0
            r3.s(r0, r7, r2)
            r0 = 0
            q67 r0 = r6.R0(r13, r0)
            goto L_0x057f
        L_0x0424:
            r6.X = r14
            r1 = 0
            r0 = r16
            r2 = r15
            r3 = r7
            r4 = r14
            r5 = r13
            q67 r0 = r0.Z0(r1, r2, r3, r4, r5)
            goto L_0x057f
        L_0x0433:
            l67 r1 = defpackage.l67.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS
            g67 r1 = r1.b
            boolean r1 = r1.a(r15)
            if (r1 != 0) goto L_0x0443
            q67 r0 = r6.W0(r9)
            goto L_0x057f
        L_0x0443:
            int r4 = r6.X
            int r3 = r4 + -1
            r2 = 46
            r1 = 0
            r5 = 0
            r0 = r16
            q67 r0 = r0.Z0(r1, r2, r3, r4, r5)
            goto L_0x057f
        L_0x0453:
            int r7 = r2 + -1
            int r1 = r6.Y
            if (r2 < r1) goto L_0x045f
            q67 r0 = r6.b1(r7, r0)
            goto L_0x057f
        L_0x045f:
            char[] r12 = r6.X0
            int r13 = r2 + 1
            char r2 = r12[r2]
            if (r2 > r5) goto L_0x04b7
            if (r2 >= r11) goto L_0x046a
            goto L_0x04b7
        L_0x046a:
            if (r2 != r11) goto L_0x0472
            q67 r0 = r6.b1(r7, r0)
            goto L_0x057f
        L_0x0472:
            r12 = r0
        L_0x0473:
            if (r13 < r1) goto L_0x047b
            q67 r0 = r6.b1(r7, r0)
            goto L_0x057f
        L_0x047b:
            char[] r2 = r6.X0
            int r14 = r13 + 1
            char r2 = r2[r13]
            if (r2 < r11) goto L_0x0489
            if (r2 <= r5) goto L_0x0486
            goto L_0x0489
        L_0x0486:
            int r12 = r12 + r0
            r13 = r14
            goto L_0x0473
        L_0x0489:
            if (r2 == r9) goto L_0x04a9
            if (r2 == r10) goto L_0x04a9
            if (r2 != r4) goto L_0x0490
            goto L_0x04a9
        L_0x0490:
            r6.X = r13
            k67 r1 = r6.A0
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x049d
            r6.j1(r2)
        L_0x049d:
            int r13 = r13 - r7
            char[] r1 = r6.X0
            r3.s(r1, r7, r13)
            q67 r0 = r6.R0(r12, r0)
            goto L_0x057f
        L_0x04a9:
            r6.X = r14
            r1 = 1
            r0 = r16
            r3 = r7
            r4 = r14
            r5 = r12
            q67 r0 = r0.Z0(r1, r2, r3, r4, r5)
            goto L_0x057f
        L_0x04b7:
            r6.X = r13
            q67 r0 = r6.V0(r2, r0)
            goto L_0x057f
        L_0x04bf:
            java.lang.String r0 = "expected a value"
            r6.I0(r1, r0)
            r0 = 0
            throw r0
        L_0x04c6:
            if (r8 != 0) goto L_0x04d0
            k67 r0 = r6.A0
            k67 r0 = r0.g(r4, r5)
            r6.A0 = r0
        L_0x04d0:
            q67 r0 = defpackage.q67.START_OBJECT
            goto L_0x057f
        L_0x04d4:
            int r1 = r2 + 3
            int r3 = r6.Y
            if (r1 >= r3) goto L_0x04fd
            char[] r3 = r6.X0
            char r4 = r3[r2]
            r5 = 114(0x72, float:1.6E-43)
            if (r4 != r5) goto L_0x04fd
            int r4 = r2 + 1
            char r4 = r3[r4]
            if (r4 != r12) goto L_0x04fd
            int r2 = r2 + 2
            char r2 = r3[r2]
            if (r2 != r10) goto L_0x04fd
            char r2 = r3[r1]
            if (r2 < r11) goto L_0x04fa
            r3 = 93
            if (r2 == r3) goto L_0x04fa
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L_0x04fd
        L_0x04fa:
            r6.X = r1
            goto L_0x0502
        L_0x04fd:
            java.lang.String r1 = "true"
            r6.Y0(r0, r1)
        L_0x0502:
            q67 r0 = defpackage.q67.VALUE_TRUE
            goto L_0x057f
        L_0x0506:
            int r1 = r2 + 3
            int r3 = r6.Y
            if (r1 >= r3) goto L_0x052d
            char[] r3 = r6.X0
            char r4 = r3[r2]
            if (r4 != r12) goto L_0x052d
            int r4 = r2 + 1
            char r4 = r3[r4]
            if (r4 != r7) goto L_0x052d
            int r2 = r2 + 2
            char r2 = r3[r2]
            if (r2 != r7) goto L_0x052d
            char r2 = r3[r1]
            if (r2 < r11) goto L_0x052a
            r3 = 93
            if (r2 == r3) goto L_0x052a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L_0x052d
        L_0x052a:
            r6.X = r1
            goto L_0x0532
        L_0x052d:
            java.lang.String r1 = "null"
            r6.Y0(r0, r1)
        L_0x0532:
            q67 r0 = defpackage.q67.VALUE_NULL
            goto L_0x057f
        L_0x0535:
            int r1 = r2 + 4
            int r3 = r6.Y
            if (r1 >= r3) goto L_0x0566
            char[] r3 = r6.X0
            char r4 = r3[r2]
            r5 = 97
            if (r4 != r5) goto L_0x0566
            int r4 = r2 + 1
            char r4 = r3[r4]
            if (r4 != r7) goto L_0x0566
            int r4 = r2 + 2
            char r4 = r3[r4]
            r5 = 115(0x73, float:1.61E-43)
            if (r4 != r5) goto L_0x0566
            int r2 = r2 + 3
            char r2 = r3[r2]
            if (r2 != r10) goto L_0x0566
            char r2 = r3[r1]
            if (r2 < r11) goto L_0x0563
            r3 = 93
            if (r2 == r3) goto L_0x0563
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L_0x0566
        L_0x0563:
            r6.X = r1
            goto L_0x056b
        L_0x0566:
            java.lang.String r1 = "false"
            r6.Y0(r0, r1)
        L_0x056b:
            q67 r0 = defpackage.q67.VALUE_FALSE
            goto L_0x057f
        L_0x056e:
            if (r8 != 0) goto L_0x0578
            k67 r0 = r6.A0
            k67 r0 = r0.f(r4, r5)
            r6.A0 = r0
        L_0x0578:
            q67 r0 = defpackage.q67.START_ARRAY
            goto L_0x057f
        L_0x057b:
            r6.b1 = r0
            q67 r0 = defpackage.q67.VALUE_STRING
        L_0x057f:
            if (r8 == 0) goto L_0x0586
            r6.B0 = r0
            q67 r0 = r6.b
            return r0
        L_0x0586:
            r6.b = r0
            return r0
        L_0x0589:
            r6.S0(r1)
            q67 r0 = r6.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0c.u0():q67");
    }

    public final void v0() {
        if (this.W0 != null) {
            if (this.c.c || g67.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.W0.close();
            }
            this.W0 = null;
        }
    }

    public r0c(tn6 tn6, int i, Reader reader, d22 d22) {
        super(tn6, i);
        this.W0 = reader;
        if (tn6.f == null) {
            char[] a = tn6.d.a(0, 0);
            tn6.f = a;
            this.X0 = a;
            this.X = 0;
            this.Y = 0;
            this.Z0 = d22;
            this.a1 = d22.c;
            this.Y0 = true;
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}
