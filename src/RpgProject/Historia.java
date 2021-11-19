package RpgProject;

public class Historia {
	
	public void prologo(Personagem p) {
		System.out.println("\t\t\t\t\t\t\tPROLOGO\n\n\n");
		System.out.println("\nSeus olhos se abrem aos poucos e a luz do sol os machuca violentamente. Você tenta abri-los novamente, mais\n"
                + " devagar, e aos poucos sua visão vai se recobrando. Quando você finalmente se sente capaz de enxergar, seu coração dispara\n"
                + " e você recupera seu fôlego como se tivesse acabado de ser estrangulado por duas mãos feitas de granito maciço. Bastante afoito,\n"
                + " você olha ao se redor e se vê numa praia deserta. Seu corpo está molhado e você sente a areia que está dentro de suas roupas arranhar\n"
                + " sua pele na medida em que você se mexe. Você não lembra do que aconteceu ou como foi para ali, e logo percebe também que não consegue se\n"
                + " lembrar do seu passado. Tudo o que você sabe é que se chama "+p.getNome()+" e costumava trabalhar como ferreiro em sua cidade natal,\n"
                + " Coltland.  Sua barriga doí como você tivesse recebido um soco no estômago. Você avista uma floresta próxima da praia e logo caminha em direção\n"
                + " a ela para procurar comida.");
	}

	
	
	public void parte1() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 1\n\n\n");
		System.out.println("\nVoce se encontra em drinanor uma cidade elfica\n"
                + "cujas florestas gigantes se expandem por toda a cidade \n"
                + "seguindo seu caminho voce passa por uma área com muitos \n"
                + "arbustos e sente um forte odor vindo deles. Do arbusto\n"
                + "sai um pequeno e fraco goblin porem hostil e que empunha uma\n"
                + "adaga.\n");
	}
	public void resultadoParte1(boolean sitacao, Personagem jogador){
		if (sitacao) {
			System.out.println("\nParabens pela vitoria "+jogador.getNome()+", espero que não tenha se cansado só com isso");
		}else {
			 System.out.println("\nO quão fraco voce pode ser ?\n"
	                    + "ao menos se esforce!!!");
		}
	}
	public void parte2() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 2\n\n\n");
		System.out.println("\n2 semanas se passaram desde sua batalha contra o globin e agora\n"
                + "voce se encontra em Harom uma cidade de anões e então um barulho\n"
                + "te chama atenção ao fundo de um enorme pantano ao deparar com o orc,\n"
                + "voce se assusta e então ele acaba por te encurralar junto a parede.\n"
                + "Ele é bem maior que você, seus músculos enormes suados cheiram como\n"
                + "um cadáver em estado de putrefação.Ele segura um machado de duas mãos.\n"
                + " O orc diz algumas palavras em sua língua nativa, porem você as\n"
                + "interpreta como VOCÊ MORRE AQUI!");
		
	}
	
    public void resultadoParte2(boolean sitacao, Personagem jogador){
    	if (sitacao) {
    		System.out.println("\n Parabens pela vitoria "+jogador.getNome()+" ele nem era tudo isso, não é mesmo ?");
		}else {
			 System.out.println("\n E a primeira vez que voce batalha "+ jogador.getNome()+" Não ? tem certeza ?");
		}
	}
    
	public void parte3() {
		System.out.println("\t\t\t\t\t\t\tCAPITULO 3\n\n\n");
		System.out.println("\nÉ uma noite de lua cheia, você acabou de chegar na cidade de Draudaty.\n"
                + " Percebe que as ruas estão vazias e não entende o pq. Você continua a andar, quando\n"
                + " de repente escuta um uivo vindo de longe. Você se prepara para o pior e fica em alerta.\n"
                + " Quando inesperadamente  no telhado de uma casa sob a luz do luar você vê uma sombra de um\n"
                + " monstro meio humano e meio lobo. Ele pula em sua direção, você desvia e se prepara para a batalha.\n");
	}
    public void resultadoParte3(boolean sitacao){
    	if (sitacao) {
    		System.out.println("\nParabens! Você derrotou o lobisomem. Agora você pode fazer uma casaco de pele de lobo para o inverno!");
		}else {
			 System.out.println("\nQue pena, você virou ração de cachorro!");
		}
	}
	public void parte4(Personagem dragao) {
		System.out.println("\t\t\t\t\t\t\tCAPITULO FINAL\n\n\n");
		System.out.println("\nVocê está caminhando com destino à Ulgaheaa, uma cidade de anões abandonada,\n"
                + " para encontrar a espada de Agboisar. O caminho é longo e começou a chover e você procura\n"
                + " abrigo em uma caverna escura. Ao adentra-la um pouco mais para se aquecer, você avista algo\n"
                + " brilhante que vem em sua direção. De repente, um grito ensurdecedor e brutal ecoa vertiginosamente\n"
                + " pelas paredes da caverna. Você se vê tão atordoado que caí no chão e começa a vomitar. Mal consegue \n"
                + "levantar direito e percebe que bem na sua frente se encontram dentes enormes e afiados, que aparentam "
            + "estar prontos para te devorar. \n Você se dá conta então de que terá de lutar contra um terrível\n"
            +  dragao.getNome()+" Seu corpo gela por inteiro e você se prepara como pode para lutar pela sua vida!\n");
	}
    public void resultadoParte4(boolean sitacao, Personagem dragao){
    	if (sitacao) {
    		System.out.println("\nInacreditável!!! Você derrotou um "+ dragao.getNome()+". Poucos heróis conseguiram esse feito.\n"
                    + " Você foi abençoado com a força e a coragem de um guerreiro lendário! Que o espírito de Ekitnein te acompanhe\n"
                    + " em sua gloriosa jornada, nobre cavaleiro.");
		}else {
			System.out.println("Pobre guerreiro, sua fama era uma farsa... Que Darktesr, senhor dos mortos, tenha piedade de sua alma.\n");
		}
	}

	

}
