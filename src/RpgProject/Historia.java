package RpgProject;

public class Historia {
	
	public void prologo(Personagem p) {
		System.out.println("\t\t\t\t\t\t\tPROLOGO\n\n\n");
		System.out.println("\nSeus olhos se abrem aos poucos e a luz do sol os machuca violentamente. Voc� tenta abri-los novamente, mais\n"
                + " devagar, e aos poucos sua vis�o vai se recobrando. Quando voc� finalmente se sente capaz de enxergar, seu cora��o dispara\n"
                + " e voc� recupera seu f�lego como se tivesse acabado de ser estrangulado por duas m�os feitas de granito maci�o. Bastante afoito,\n"
                + " voc� olha ao se redor e se v� numa praia deserta. Seu corpo est� molhado e voc� sente a areia que est� dentro de suas roupas arranhar\n"
                + " sua pele na medida em que voc� se mexe. Voc� n�o lembra do que aconteceu ou como foi para ali, e logo percebe tamb�m que n�o consegue se\n"
                + " lembrar do seu passado. Tudo o que voc� sabe � que se chama "+p.getNome()+" e costumava trabalhar como ferreiro em sua cidade natal,\n"
                + " Coltland.  Sua barriga do� como voc� tivesse recebido um soco no est�mago. Voc� avista uma floresta pr�xima da praia e logo caminha em dire��o\n"
                + " a ela para procurar comida.");
	}

	
	
	public void parte1() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 1\n\n\n");
		System.out.println("\nVoce se encontra em drinanor uma cidade elfica\n"
                + "cujas florestas gigantes se expandem por toda a cidade \n"
                + "seguindo seu caminho voce passa por uma �rea com muitos \n"
                + "arbustos e sente um forte odor vindo deles. Do arbusto\n"
                + "sai um pequeno e fraco goblin porem hostil e que empunha uma\n"
                + "adaga.\n");
	}
	public void resultadoParte1(boolean sitacao, Personagem jogador){
		if (sitacao) {
			System.out.println("\nParabens pela vitoria "+jogador.getNome()+", espero que n�o tenha se cansado s� com isso");
		}else {
			 System.out.println("\nO qu�o fraco voce pode ser ?\n"
	                    + "ao menos se esforce!!!");
		}
	}
	public void parte2() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 2\n\n\n");
		System.out.println("\n2 semanas se passaram desde sua batalha contra o globin e agora\n"
                + "voce se encontra em Harom uma cidade de an�es e ent�o um barulho\n"
                + "te chama aten��o ao fundo de um enorme pantano ao deparar com o orc,\n"
                + "voce se assusta e ent�o ele acaba por te encurralar junto a parede.\n"
                + "Ele � bem maior que voc�, seus m�sculos enormes suados cheiram como\n"
                + "um cad�ver em estado de putrefa��o.Ele segura um machado de duas m�os.\n"
                + " O orc diz algumas palavras em sua l�ngua nativa, porem voc� as\n"
                + "interpreta como VOC� MORRE AQUI!");
		
	}
	
    public void resultadoParte2(boolean sitacao, Personagem jogador){
    	if (sitacao) {
    		System.out.println("\n Parabens pela vitoria "+jogador.getNome()+" ele nem era tudo isso, n�o � mesmo ?");
		}else {
			 System.out.println("\n E a primeira vez que voce batalha "+ jogador.getNome()+" N�o ? tem certeza ?");
		}
	}
    
	public void parte3() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 3\n\n\n");
		System.out.println("\n� uma noite de lua cheia, voc� acabou de chegar na cidade de Draudaty.\n"
                + " Percebe que as ruas est�o vazias e n�o entende o pq. Voc� continua a andar, quando\n"
                + " de repente escuta um uivo vindo de longe. Voc� se prepara para o pior e fica em alerta.\n"
                + " Quando inesperadamente  no telhado de uma casa sob a luz do luar voc� v� uma sombra de um\n"
                + " monstro meio humano e meio lobo. Ele pula em sua dire��o, voc� desvia e se prepara para a batalha.\n");
	}
    public void resultadoParte3(boolean sitacao){
    	if (sitacao) {
    		System.out.println("\nParabens! Voc� derrotou o lobisomem. Agora voc� pode fazer uma casaco de pele de lobo para o inverno!");
		}else {
			 System.out.println("\nQue pena, voc� virou ra��o de cachorro!");
		}
	}
	public void parte4(Personagem dragao) {
		System.out.println("\t\t\t\t\t\t\tCAPITULO FINAL\n\n\n");
		System.out.println("\nVoc� est� caminhando com destino � Ulgaheaa, uma cidade de an�es abandonada,\n"
                + " para encontrar a espada de Agboisar. O caminho � longo e come�ou a chover e voc� procura\n"
                + " abrigo em uma caverna escura. Ao adentra-la um pouco mais para se aquecer, voc� avista algo\n"
                + " brilhante que vem em sua dire��o. De repente, um grito ensurdecedor e brutal ecoa vertiginosamente\n"
                + " pelas paredes da caverna. Voc� se v� t�o atordoado que ca� no ch�o e come�a a vomitar. Mal consegue \n"
                + "levantar direito e percebe que bem na sua frente se encontram dentes enormes e afiados, que aparentam "
            + "estar prontos para te devorar. \n Voc� se d� conta ent�o de que ter� de lutar contra um terr�vel\n"
            +  dragao.getNome()+" Seu corpo gela por inteiro e voc� se prepara como pode para lutar pela sua vida!\n");
	}
    public void resultadoParte4(boolean sitacao, Personagem dragao){
    	if (sitacao) {
    		System.out.println("\nInacredit�vel!!! Voc� derrotou um "+ dragao.getNome()+". Poucos her�is conseguiram esse feito.\n"
                    + " Voc� foi aben�oado com a for�a e a coragem de um guerreiro lend�rio! Que o esp�rito de Ekitnein te acompanhe\n"
                    + " em sua gloriosa jornada, nobre cavaleiro.");
		}else {
			System.out.println("Pobre guerreiro, sua fama era uma farsa... Que Darktesr, senhor dos mortos, tenha piedade de sua alma.\n");
		}
	}

	

}
