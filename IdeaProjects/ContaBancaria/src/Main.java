import javax.swing.JOptionPane;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Connection cn = new Connection();

    if(cn.senha == cn.senhaCorreta){
        JOptionPane.showMessageDialog(null, "Senha correta, acesso ao saldo");
    }else{
        for(int i = 0; i <3; i++){
            JOptionPane.showMessageDialog(null, "senha incorreta, você tem mais" + new int[]{i} + "tentativas");
            JOptionPane.showInputDialog(null, "digite novamente");
            int tentativas = 0;
            if(tentativas == i){
                System.exit(0);
            }
        }
    }

    JOptionPane.showConfirmDialog(null, "Bem vindo! " +cn.nome);


    JOptionPane.showConfirmDialog(null, "Enviaremos um código de verificação para: " + cn.email);




    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.



}
