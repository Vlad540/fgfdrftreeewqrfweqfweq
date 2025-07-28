package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;
import com.my.tracker.obfuscated.s0;

final class t0 implements s0 {
    private final j0 a;

    public static final class a implements s0.a {
        private final j0 a;
        private final j0.b b;

        public a(j0 j0Var, j0.b bVar) {
            this.a = j0Var;
            this.b = bVar;
        }

        public boolean a() {
            return this.b.a();
        }

        public long b() {
            return this.b.b();
        }

        public void close() {
            this.b.close();
        }

        public s0.b d() {
            return new b(this.a.c(this.b.c()));
        }

        public long f() {
            return this.b.f();
        }

        public byte[] l() {
            return this.b.l();
        }
    }

    public static final class b implements s0.b {
        private final j0.c a;

        public b(j0.c cVar) {
            this.a = cVar;
        }

        public boolean a() {
            return this.a.a();
        }

        public void close() {
            this.a.close();
        }

        public long k() {
            return this.a.k();
        }
    }

    public t0(j0 j0Var) {
        this.a = j0Var;
    }

    public s0.a a() {
        j0 j0Var = this.a;
        return new a(j0Var, j0Var.g());
    }
}
