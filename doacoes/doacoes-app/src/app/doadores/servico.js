import AbstractCrudService from "../abstract.crud.service";

export default class DoadorServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/doacoes-web/api/doadores')
  }

}

DoadorServico.$inject = ['$http']
