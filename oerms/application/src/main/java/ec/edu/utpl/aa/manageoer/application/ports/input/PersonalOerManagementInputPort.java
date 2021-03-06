package ec.edu.utpl.aa.manageoer.application.ports.input;

import ec.edu.utpl.aa.manageoer.application.ports.output.PersonalOerManagementOutputPort;
import ec.edu.utpl.aa.manageoer.application.usecases.PersonalOerManagementUseCase;
import ec.edu.utpl.aa.manageoer.domain.entity.Oer;
import ec.edu.utpl.aa.manageoer.domain.valueobjects.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import java.sql.Date;
import java.util.List;

@ApplicationScoped
public class PersonalOerManagementInputPort implements PersonalOerManagementUseCase {
    @Inject
    PersonalOerManagementOutputPort personalOerManagementOutputPort;

    @Override
    public Oer createOer(String title, String description, Date creation_date, Date update_date,
                            List<Author> authors, Category category, Collaborator collaborator, List<File> files,
                            List<Keyword> keywords, License license, Platform platform, State state) {

        return personalOerManagementOutputPort.createOer(title, description, creation_date, update_date, authors,
                category, collaborator, files, keywords, license, platform, state);
    }

    @Override
    public List<Oer> retrieveOers(String collaboratorEmail) {
        return personalOerManagementOutputPort.retrieveOers(collaboratorEmail);
    }

    @Override
    public Oer updateOer(String id, String title, String description, Date creation_date, Date update_date,
                         List<Author> authors, Category category, Collaborator collaborator, List<File> files,
                         List<Keyword> keywords, License license, Platform platform, State state){

        return personalOerManagementOutputPort.updateOer(id, title, description, creation_date, update_date, authors,
                category, collaborator, files, keywords, license, platform, state);
    }

    @Override
    public void deleteOer(String id){ personalOerManagementOutputPort.deleteOer(id); }

}
