
package mx.itsin.edu.mai;


import mx.itson.edu.es.Category;
import mx.itsin.edu.clas.Comments;
import mx.itsin.edu.clas.NamePublication;
import mx.itsin.edu.clas.ReplyComment;
import mx.itsin.edu.clas.User;
import mx.itsin.edu.clas.Votes;


/**
 *
 * @author Marco Lopez
 */
public class Main {

    
    public static void main(String[] args) {
       
        //datos del usuario en comentar
        User user = new User();
        user.setUsername("hasbulla20");
        user.setPassword("marquitos11");
        user.setEmail("hasbullabelico30@gmail.com");
        

        //datos de la publicacion 
        NamePublication namepublication = new NamePublication();
        namepublication.setUser(user);
        namepublication.setNamepubli("Mi Querido Dia");
        namepublication.setDay("15/10/23");
        namepublication.setDescription("El dia de hoy me levante muy contento por que iba asalir con mis amigos hacia la playa, me gusto");
        namepublication.setCategory(Category.daily);
        
        
        //el comentario del usuario hacia la publicacion
        Comments comments = new Comments();
        comments.setUserName("eltortas20");
        comments.setDescription("La verdad me parecio algo bien tu rutina el dia domingo, me alegro que disfrutes a tus amigos");
        
        
                
        //los votos que recibio el comentario del usuario en la publicacion
        Votes votes = new Votes();
        votes.setPositive("489");
        votes.setNegative("102");
       
        // el comentario contestado por el anfrition
        ReplyComment replycomment = new ReplyComment();
        replycomment.setUser(user);
        replycomment.setDescriptionR("muchas gracias <3");
        replycomment.setDay("17/10/23");
        replycomment.setLike(11);
        replycomment.setDislike(2);       
        
        
        System.out.println("DATOS DEL ANFRITION");
        
        System.out.println("Nombre Usuario: "+ user.getUsername());
        System.out.println("Correo usuario: "+ user.getEmail());       
        System.out.println("Contraseña del usuario: "+ user.getPassword());
        
        System.out.println("           ");
        
        System.out.println("-------------------------------------");
        
        System.out.println("Titulo Publicacion: "+ namepublication.getNamepubli());
        System.out.println("Realizada por: "+ user.getUsername());
        System.out.println("Dia publicado: "+ namepublication.getDay());
        System.out.println("           ");
        System.out.println("-------------------------------------");
        
        System.out.println("COMENTARIOS - OPINIONES");
        
        System.out.println("Comentario de eltortas20: "+ comments.getDescription());
        System.out.println("votos positivos: "+ votes.getPositive());
        System.out.println("votos negativos: "+ votes.getNegative());
        
        System.out.println("-------------------------------------");
        
        System.out.println("COMENTARIO RSPONDIDO A: eltortas20");
        
        System.out.println("Respuesta hacia el eltortas20: "+ replycomment.getDescriptionR());
        System.out.println("Fecha contestado: "+ replycomment.getDay());
                
     
        
        
        
        
        
        
    }
    
}
