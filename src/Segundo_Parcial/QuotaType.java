package Segundo_Parcial;

public enum QuotaType {
    UNLIMITED{
        @Override
        public boolean canRead(int reads){
            return true;
        }
        @Override
        public boolean canWrite(int writes){
            return true;
        }
    },

    LIMITED{
        @Override
        public boolean canRead(int reads){
            return reads < 2;
        }
        @Override
        public boolean canWrite(int writes){
            return writes < 1;
        }
    };

    abstract boolean canRead(int reads);
    abstract boolean canWrite(int writes);
}
